/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.evm.citsmartevm.schedulers;

/**
 *
 * @author adenir
 */
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import br.com.centralit.evm.citsmartevm.entity.nagios.Hosts;
import br.com.centralit.evm.correlacaoeventos.util.JSONConverter;

@Model
@MessageDriven(name = "messageConsumerBean", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/CitsmartEVM/nagiosEventResponse"),
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MessageConsumerBean implements MessageListener {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    private final static Logger LOGGER = Logger.getLogger(MessageConsumerBean.class.toString());

    @Override
    public void onMessage(Message rcvMessage) {
        TextMessage msg = null;
        try {
            if (rcvMessage instanceof TextMessage) {
                msg = (TextMessage) rcvMessage;
 
                Hosts host = reciveHost(msg.getText());
//                host.toString();
                System.out.println("Citevent: Message from in: queueRequest \n" + host.toString());
                

            } else {
                System.out.println("Message of wrong type: " + rcvMessage.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

    @Produces
    @Named
    public String messageIncoming() {
        return response;
    }
    
    private Hosts reciveHost(String strJson){
        Hosts host = JSONConverter.fromJson(strJson, Hosts.class);
        return host;
    }
}

package br.com.centralit.nagios.livestatus.actions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author adenir
 */
@MessageDriven(name = "connectionToNagiosConsumer", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/CitsmartEVM/nagiosEventResponse"),
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})

public class ConnectionToNagiosConsumer implements MessageListener {

 
 

    
    public ConnectionToNagiosConsumer() {

    }

    @Override
    public void onMessage(Message rcvMessage) {
        //TODO codificar a mensagem
        //String msg = null;
        try {
            if (rcvMessage instanceof TextMessage) {
                String messageIncoming = ((TextMessage) rcvMessage).getText();
                System.out.println("Modulo Nagios:\n" + messageIncoming);

            } else {
                System.out.println("***ERROR*** - Message of wrong type: " + rcvMessage.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionToNagiosConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}

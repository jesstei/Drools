package org.hda.eventreception;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.hda.eventprocessing.Normalization;

/**
 * Message-Driven Bean implementation class for: EventMDB
 */
@MessageDriven(
		activationConfig = { 
		 @ActivationConfigProperty(	propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		 @ActivationConfigProperty( propertyName = "destination", propertyValue = "java:/jms/queue/EventQueue"),
		 @ActivationConfigProperty( propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
		})
@TransactionManagement(TransactionManagementType.BEAN)
public class EventMDB implements MessageListener {

	@EJB
	private Normalization events;
	
	
    /**
     * Default constructor. 
     */
    public EventMDB() {
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * Member of MessageListener implementing a receive method of messages send to the JMS Queue called EventQueue
     * @see MessageListener#onMessage(Message)
     * @param message An message send to the EventQueue
     */
    public void onMessage(Message message) {
    	if (message instanceof TextMessage){
			TextMessage tm = (TextMessage) message;        		
			//System.out.println("Received message on EMDB is ==========> " + tm.getText());
			events.normalizeEvent(tm);
			
		}
		else{
			System.out.println("Received unexpected message type: "+message.getClass().getName());
		}        
    }
}

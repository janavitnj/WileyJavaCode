package com.wiley.notification;

 interface Notification {
    void notifyUser();
}
 
 class SMSNotification implements Notification {
	 
	    public void notifyUser()
	    {
	        // TODO Auto-generated method stub
	        System.out.println("Sending an SMS notification");
	    }
	}
 
 class EmailNotification implements Notification {
	 
	  
	    public void notifyUser()
	    {
	        // TODO Auto-generated method stub
	        System.out.println("Sending an e-mail notification");
	    }
	}
 
 class PushNotification implements Notification {
	 
	   
	    public void notifyUser()
	    {
	        // TODO Auto-generated method stub
	        System.out.println("Sending a push notification");
	    }
	}
 class NotificationFactory {
	    public Notification createNotification(String channel)
	    {
	        if (channel == null || channel.isEmpty())
	            return null;
	        switch (channel) {
	        case "SMS":
	            return new SMSNotification();
	        case "EMAIL":
	            return new EmailNotification();
	        case "PUSH":
	            return new PushNotification();
	        default:
	            throw new IllegalArgumentException("Unknown channel "+channel);
	        }
	    }
	}
public class NotificatioService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
	}

}

package notification;

import notification.notifications.EmailNotification;
import notification.notifications.INotification;
import notification.notifications.PushNotification;
import notification.notifications.SMSNotification;

public class NotificationFacade {
    public void sendNotification(String message, Long userId ){
        INotification emailNotification = new EmailNotification();
        INotification pushNotification = new PushNotification();
        INotification smsNotification = new SMSNotification();

        emailNotification.sendNotification(message, userId);
        pushNotification.sendNotification(message, userId);
        smsNotification.sendNotification(message, userId);
    }

}

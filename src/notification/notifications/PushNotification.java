package notification.notifications;

import java.util.List;

public class PushNotification implements INotification{
    @Override
    public void sendNotification(String message, Long userId) {
        System.out.println("Push notification sent to user " + userId + ": " + message);

    }

    @Override
    public void bulkSendNotification(String message, List<Long> userIds) {
        for (Long userId : userIds) {
            sendNotification(message, userId);
        }

    }
}

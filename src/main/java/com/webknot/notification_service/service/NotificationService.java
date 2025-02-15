package com.webknot.notification_service.service;

import com.webknot.notification_service.model.NotificationModel;
import com.webknot.notification_service.model.NotificationType;
import com.webknot.notification_service.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public NotificationModel createNotification(NotificationModel notification) {
        return notificationRepository.save(notification);
    }

    public List<NotificationModel> getUserNotifications(Long userId) {
        return notificationRepository.findByUserId(userId);
    }
}

package com.webknot.notification_service.repository;

import com.webknot.notification_service.model.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, Long> {
    List<NotificationModel> findByUserId(Long userId);
}

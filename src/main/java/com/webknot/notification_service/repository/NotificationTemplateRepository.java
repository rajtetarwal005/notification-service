package com.webknot.notification_service.repository;

import com.webknot.notification_service.model.NotificationTemplateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplateModel, Long> {
}


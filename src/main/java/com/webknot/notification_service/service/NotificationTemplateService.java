package com.webknot.notification_service.service;


import com.webknot.notification_service.model.NotificationTemplateModel;
import com.webknot.notification_service.repository.NotificationTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationTemplateService {

    private final NotificationTemplateRepository templateRepository;

    public NotificationTemplateService(NotificationTemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    // Create a new template
    public NotificationTemplateModel createTemplate(NotificationTemplateModel template) {
        return templateRepository.save(template);
    }

    // Get all templates
    public List<NotificationTemplateModel> getAllTemplates() {
        return templateRepository.findAll();
    }

    // Get a template by ID
    public NotificationTemplateModel getTemplateById(Long id) {
        return templateRepository.findById(id).orElse(null);
    }

    // Delete a template by ID
    public void deleteTemplate(Long id) {
        templateRepository.deleteById(id);
    }
}


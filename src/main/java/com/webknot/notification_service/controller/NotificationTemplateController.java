package com.webknot.notification_service.controller;

import com.webknot.notification_service.model.NotificationTemplateModel;
import com.webknot.notification_service.service.NotificationTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class NotificationTemplateController {
    private final NotificationTemplateService templateService;

    public NotificationTemplateController(NotificationTemplateService templateService) {
        this.templateService = templateService;
    }

    // Create a new notification template
    @PostMapping("/create")
    public NotificationTemplateModel createTemplate(@RequestBody NotificationTemplateModel template) {
        return templateService.createTemplate(template);
    }

    // Get all notification templates
    @GetMapping
    public List<NotificationTemplateModel> getAllTemplates() {
        return templateService.getAllTemplates();
    }

    // Get a specific notification template by ID
    @GetMapping("/{id}")
    public NotificationTemplateModel getTemplateById(@PathVariable Long id) {
        return templateService.getTemplateById(id);
    }

    // Delete a notification template by ID
    @DeleteMapping("/{id}")
    public void deleteTemplate(@PathVariable Long id) {
        templateService.deleteTemplate(id);
    }
}

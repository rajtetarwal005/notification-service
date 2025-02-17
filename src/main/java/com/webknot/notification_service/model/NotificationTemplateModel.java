package com.webknot.notification_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "notification_templates")
public class NotificationTemplateModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;   // Template title
    private String content; // Message content

    public NotificationTemplateModel() {}

    public NotificationTemplateModel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


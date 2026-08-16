package org.orders.notificationService.notification.repository;

import org.orders.notificationService.notification.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository
        extends JpaRepository<Notification, UUID> {
}

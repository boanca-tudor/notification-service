package org.orders.notificationService.notification.dto;

import java.util.UUID;

public record NotificationRequest(
        UUID userId,
        UUID orderId,
        String status,
        String message
) {
}

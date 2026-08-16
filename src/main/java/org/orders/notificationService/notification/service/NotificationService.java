package org.orders.notificationService.notification.service;

import lombok.RequiredArgsConstructor;
import org.orders.notificationService.notification.dto.NotificationRequest;
import org.orders.notificationService.notification.dto.NotificationResponse;
import org.orders.notificationService.notification.model.Notification;
import org.orders.notificationService.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository
            notificationRepository;

    public NotificationResponse sendNotification(
            NotificationRequest request
    ) {

        Notification notification =
                Notification.builder()
                        .userId(request.userId())
                        .orderId(request.orderId())
                        .status(request.status())
                        .message(request.message())
                        .sentAt(LocalDateTime.now())
                        .build();

        notificationRepository.save(notification);

        System.out.printf(
                """
                    ====================================
                    NOTIFICATION SENT
                    ====================================
                    User: %s
                    Order: %s
                    Status: %s
                    Message: %s
                    ====================================
                    
                    %n""", request.userId(),
                request.orderId(),
                request.status(),
                request.message()
        );

        return new NotificationResponse(
                "SENT"
        );
    }
}
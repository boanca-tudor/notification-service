package org.orders.notificationService.notification.controller;

import lombok.RequiredArgsConstructor;
import org.orders.notificationService.notification.dto.NotificationRequest;
import org.orders.notificationService.notification.dto.NotificationResponse;
import org.orders.notificationService.notification.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService
            notificationService;

    @PostMapping("/send")
    public ResponseEntity<NotificationResponse>
    sendNotification(
            @RequestBody NotificationRequest request
    ) {

        return ResponseEntity.ok(
                notificationService.sendNotification(
                        request
                )
        );
    }
}

package org.orders.notificationService.notification.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue
    private UUID id;

    private UUID userId;

    private UUID orderId;

    private String status;

    @Column(length = 1000)
    private String message;

    private LocalDateTime sentAt;
}

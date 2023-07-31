package com.oscaris.cateringservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CateServices {
    @Id
    private String cateServiceId;
    private String catServiceName;
    private LocalDateTime catServiceRequestTime;
    private Double catServiceQuotation;
    private String customerId;
}

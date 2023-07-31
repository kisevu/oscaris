package com.oscaris.customer.DTO;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CateServices {
    private String catServiceName;
    private LocalDateTime catServiceRequestTime;
    private Double catServiceQuotation;
    private String customerId;
}

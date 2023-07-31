package com.oscaris.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    private String customerId;
    private String customerEmail;
    private String username;
    private String password;
    private String phoneNumber;
}

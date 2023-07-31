package com.oscaris.cateringservices.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CateServicesModel {
    private String catServiceName;
    private Double catServiceQuotation;
    private String customerId;
}

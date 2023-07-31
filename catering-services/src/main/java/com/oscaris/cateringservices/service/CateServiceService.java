package com.oscaris.cateringservices.service;

import com.oscaris.cateringservices.DTO.CateServicesModel;
import com.oscaris.cateringservices.entity.CateServices;
import com.oscaris.cateringservices.repository.CatServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CateServiceService {
    private final CatServiceRepository catServiceRepository;
    public String setId(){
        return UUID.randomUUID().toString()
                .replace("-", "")
                .substring(0, 12);
    }
    public CateServices addService(CateServicesModel cateServicesModel) {
        CateServices cateServices = CateServices.builder()
                .cateServiceId(setId())
                .catServiceName(cateServicesModel.getCatServiceName())
                .catServiceQuotation(cateServicesModel.getCatServiceQuotation())
                .catServiceRequestTime(LocalDateTime.now())
                .customerId(null)
                .build();
        return catServiceRepository.save(cateServices);
    }
    public List<CateServices> allServices() {
        return catServiceRepository.findAll();
    }
}

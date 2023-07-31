package com.oscaris.cateringservices.controller;

import com.oscaris.cateringservices.DTO.CateServicesModel;
import com.oscaris.cateringservices.entity.CateServices;
import com.oscaris.cateringservices.service.CateServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class CateServiceController {
    private final CateServiceService cateServiceService;
    @PostMapping("/add")
    public ResponseEntity<?> addService(@RequestBody CateServicesModel cateServicesModel){
        CateServices cateServices = cateServiceService.addService(cateServicesModel);
        return new ResponseEntity<>(
                cateServices
                ,HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<?> allServices(){
        return new ResponseEntity<>(cateServiceService.allServices(),HttpStatus.OK);
    }
}

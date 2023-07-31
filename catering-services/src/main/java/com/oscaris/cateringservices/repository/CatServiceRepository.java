package com.oscaris.cateringservices.repository;

import com.oscaris.cateringservices.entity.CateServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatServiceRepository extends JpaRepository<CateServices,String> {
}

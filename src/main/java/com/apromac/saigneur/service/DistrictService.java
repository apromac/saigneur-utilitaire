package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.DistrictEntity;

import java.util.List;
import java.util.Optional;

public interface DistrictService {
    public Optional<DistrictEntity> findByDistrictID(Long districtID);
    public List<DistrictEntity> findAllDistrict();
}

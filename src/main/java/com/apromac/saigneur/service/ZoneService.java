package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.ZoneEntity;

import java.util.List;

public interface ZoneService {
    public ZoneEntity findByZoneID(Long zoneID);
    public ZoneEntity findByLibelleZone(String libelleZone);
    public List<ZoneEntity> findByDistrict(Long districtID);
    public List<ZoneEntity> findAllZone();
}


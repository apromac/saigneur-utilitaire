package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.ZoneEntity;

import java.util.List;
import java.util.Optional;

public interface ZoneService {
    public Optional<ZoneEntity> findByZoneID(Long zoneID);
    public List<ZoneEntity> findAllZone();
}

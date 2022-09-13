package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.MotivationEntity;

import java.util.List;
import java.util.Optional;

public interface MotivationService {
    public Optional<MotivationEntity> findByMotivationID(Long motivationID);
    public List<MotivationEntity> findAllMotivation();
}

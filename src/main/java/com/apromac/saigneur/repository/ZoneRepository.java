package com.apromac.saigneur.repository;

import com.apromac.saigneur.entity.DistrictEntity;
import com.apromac.saigneur.entity.ZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZoneRepository extends JpaRepository<ZoneEntity, Long> {
    List<ZoneEntity> findByDistrict(DistrictEntity district);
}

//    ZoneEntity findByLibelleZone(String libelleZone);

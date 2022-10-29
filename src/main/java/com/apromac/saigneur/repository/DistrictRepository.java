package com.apromac.saigneur.repository;

import com.apromac.saigneur.entity.DistrictEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Long> {
    DistrictEntity findByLibelleDistrict(String libelleDistrict);
}

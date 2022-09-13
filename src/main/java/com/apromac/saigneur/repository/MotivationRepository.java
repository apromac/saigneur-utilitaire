package com.apromac.saigneur.repository;

import com.apromac.saigneur.entity.MotivationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivationRepository extends JpaRepository<MotivationEntity, Long> {
}

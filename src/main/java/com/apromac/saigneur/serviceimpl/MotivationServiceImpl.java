package com.apromac.saigneur.serviceimpl;

import com.apromac.saigneur.entity.MotivationEntity;
import com.apromac.saigneur.exception.NotFoundException;
import com.apromac.saigneur.repository.MotivationRepository;
import com.apromac.saigneur.service.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MotivationServiceImpl implements MotivationService {

    @Autowired
    private MotivationRepository motivationRepository;


    /**
     *
     * @param motivationID
     * @return
     */
    @Override
    public Optional<MotivationEntity> findByMotivationID(Long motivationID) {
        Optional<MotivationEntity> motivationOptional = motivationRepository.findById(motivationID);

        if (!motivationOptional.isPresent())
            throw new NotFoundException("Désolé, la motivation désignée n'existe pas");

        return motivationOptional;
    }

    /**
     *
     * @return
     */
    @Override
    public List<MotivationEntity> findAllMotivation() {
        List<MotivationEntity> motivations = motivationRepository.findAll();

        if (motivations.isEmpty())
            throw new NotFoundException("Désolé, aucune motivation disponible");

        return motivations;
    }

}

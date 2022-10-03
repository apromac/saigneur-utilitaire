package com.apromac.saigneur.serviceimpl;

import com.apromac.saigneur.entity.MotivationEntity;
import com.apromac.saigneur.exception.NoContentException;
import com.apromac.saigneur.exception.NotFoundException;
import com.apromac.saigneur.repository.MotivationRepository;
import com.apromac.saigneur.service.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
            throw new NoContentException("Désolé, aucune motivation disponible");

        return motivations;
    }

}

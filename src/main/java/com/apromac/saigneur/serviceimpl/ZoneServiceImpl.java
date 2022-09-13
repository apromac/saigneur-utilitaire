package com.apromac.saigneur.serviceimpl;

import com.apromac.saigneur.entity.ZoneEntity;
import com.apromac.saigneur.exception.NotFoundException;
import com.apromac.saigneur.repository.ZoneRepository;
import com.apromac.saigneur.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;


    /**
     *
     * @param zoneID
     * @return
     */
    @Override
    public Optional<ZoneEntity> findByZoneID(Long zoneID) {
        Optional<ZoneEntity> zoneOptional = zoneRepository.findById(zoneID);

        if (!zoneOptional.isPresent())
            throw new NotFoundException("Désolé, la zone désignée n'existe pas");

        return zoneOptional;
    }

    /**
     *
     * @return
     */
    @Override
    public List<ZoneEntity> findAllZone() {
        List<ZoneEntity> zones = zoneRepository.findAll();

        if (zones.isEmpty())
            throw new NotFoundException("Désolé, aucune zone disponible");

        return zones;
    }

}

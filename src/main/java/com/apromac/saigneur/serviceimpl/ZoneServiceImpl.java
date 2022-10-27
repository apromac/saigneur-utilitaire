package com.apromac.saigneur.serviceimpl;

import com.apromac.saigneur.entity.DistrictEntity;
import com.apromac.saigneur.entity.ZoneEntity;
import com.apromac.saigneur.exception.NoContentException;
import com.apromac.saigneur.exception.NotFoundException;
import com.apromac.saigneur.repository.DistrictRepository;
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

    @Autowired
    private DistrictRepository districtRepository;



    /**
     * Méthode permettant de récupérer la liste des zones héveicoles en fonction de l'ID du district
     * @param districtID representant l'ID du district
     * @return
     */
    @Override
    public List<ZoneEntity> findByDistrict(Long districtID) {
        Optional<DistrictEntity> districtOptional = districtRepository.findById(districtID);
        if (!districtOptional.isPresent())
            throw new NotFoundException("Désolé, aucun district correspondant à celui-ci.");

        List<ZoneEntity> zonesDistrict = zoneRepository.findByDistrict(districtOptional.get());
        if (zonesDistrict.isEmpty())
            throw new NoContentException("Désolé, aucune zone disponible pour ce district");

        return zonesDistrict;
    }

}



//    /**
//     *
//     * @param zoneID
//     * @return
//     */
//    @Override
//    public ZoneEntity findByZoneID(Long zoneID) {
//        Optional<ZoneEntity> zoneOptional = zoneRepository.findById(zoneID);
//        if (!zoneOptional.isPresent())
//            throw new NotFoundException("Désolé, la zone désignée n'existe pas");
//
//        return zoneOptional.get();
//    }
//
//    /**
//     *
//     * @param libelleZone
//     * @return
//     */
//    @Override
//    public ZoneEntity findByLibelleZone(String libelleZone) {
//        ZoneEntity zoneEntity = zoneRepository.findByLibelleZone(libelleZone);
//        if (zoneEntity == null)
//            throw new NotFoundException("Désolé, ");
//
//        return zoneEntity;
//    }
//
//
//    /**
//     *
//     * @param districtID
//     * @return
//     */
//    @Override
//
//
//    /**
//     *
//     * @return
//     */
//    @Override
//    public List<ZoneEntity> findAllZone() {
//        List<ZoneEntity> zones = zoneRepository.findAll();
//
//        if (zones.isEmpty())
//            throw new NoContentException("Désolé, aucune zone disponible");
//
//        return zones;
//    }

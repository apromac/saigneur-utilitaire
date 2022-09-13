package com.apromac.saigneur.serviceimpl;

import com.apromac.saigneur.entity.DistrictEntity;
import com.apromac.saigneur.exception.NotFoundException;
import com.apromac.saigneur.repository.DistrictRepository;
import com.apromac.saigneur.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;


    /**
     *
     * @param districtID
     * @return
     */
    @Override
    public Optional<DistrictEntity> findByDistrictID(Long districtID) {
        Optional<DistrictEntity> districtOptional = districtRepository.findById(districtID);

        if (!districtOptional.isPresent())
            throw new NotFoundException("Désolé, le district désigné n'existe pas");

        return districtOptional;
    }


    /**
     *
     * @return
     */
    @Override
    public List<DistrictEntity> findAllDistrict() {
        List<DistrictEntity> districts = districtRepository.findAll();

        if (districts.isEmpty())
            throw new NotFoundException("Désolé, aucun district disponible");

        return districts;
    }

}
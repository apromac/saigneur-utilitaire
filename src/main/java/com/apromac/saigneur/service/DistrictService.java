package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.DistrictEntity;

import java.util.List;

public interface DistrictService {

    /**
     * Methode permettant de récupérer la liste des districts
     * @return
     */
    public List<DistrictEntity> findAllDistrict();

    /**
     * Méthode permettant de récupérer un district grace à son ID
     * @param districtID
     * @return
     */
    public DistrictEntity findByDistrictID(Long districtID);

}


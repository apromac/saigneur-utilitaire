package com.apromac.saigneur.service;

import com.apromac.saigneur.entity.ZoneEntity;

import java.util.List;

public interface ZoneService {

    /**
     * Méthode permettant de récupérer la liste des zones héveicoles en fonction du libelle du district
     * @param libelleDistrict
     * @return
     */
    public List<ZoneEntity> findByLibelleDistrict(String libelleDistrict);

}


//
//    public ZoneEntity findByZoneID(Long zoneID);
//    public ZoneEntity findByLibelleZone(String libelleZone);
//    public List<ZoneEntity> findAllZone();

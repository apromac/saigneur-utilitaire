package com.apromac.saigneur.controller;

import com.apromac.saigneur.entity.ZoneEntity;
import com.apromac.saigneur.service.ZoneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @ApiOperation(value = "Méthode permettant de récupérer une zone grace à son ID")
    @GetMapping(value = "/zone/findByZoneID/{zoneID}")
    public ResponseEntity<ZoneEntity> recupererUneZone(@PathVariable long zoneID) {
        ZoneEntity zone = zoneService.findByZoneID(zoneID);

        return new ResponseEntity<>(zone, HttpStatus.OK);
    }

    @ApiOperation(value = "Méthode permettant de récupérer une zone grace à son ID")
    @GetMapping(value = "/zone/findByLibelleZone/{libelleZone}")
    public ResponseEntity<ZoneEntity> recupererUneZone(@PathVariable String libelleZone) {
        ZoneEntity zone = zoneService.findByLibelleZone(libelleZone);

        return new ResponseEntity<>(zone, HttpStatus.OK);
    }
































    @ApiOperation(value = "Méthode permettant de récupérer la liste des zones d'un district grace à son ID")
    @GetMapping(value = "/zone/findByDistrict/{districtID}")
    public ResponseEntity<List<ZoneEntity>> recupererZoneParDistrict(@PathVariable long districtID) {
        List<ZoneEntity> districtZones = zoneService.findByDistrict(districtID);

        return new ResponseEntity<>(districtZones, HttpStatus.OK);
    }

    @ApiOperation(value = "Méthode permettant de récupérer la liste des zones")
    @GetMapping(value = "/zone/findAllZone")
    public ResponseEntity<List<ZoneEntity>> recupererZones() {
        List<ZoneEntity> zones = zoneService.findAllZone();

        return new ResponseEntity<>(zones, HttpStatus.OK);
    }

}

package com.apromac.saigneur.controller;

import com.apromac.saigneur.entity.ZoneEntity;
import com.apromac.saigneur.service.ZoneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @ApiOperation(value = "Méthode permettant de récupérer une zone grace à son ID")
    @GetMapping(value = "/zone/findByZoneID/{zoneID}")
    public ResponseEntity<ZoneEntity> recupererUneZone(@PathVariable long zoneID) {
        Optional<ZoneEntity> zoneOptional = zoneService.findByZoneID(zoneID);

        return new ResponseEntity<>(zoneOptional.get(), HttpStatus.OK);
    }

    @ApiOperation(value = "Méthode permettant de récupérer la liste des zones")
    @GetMapping(value = "/zone/findAllZone")
    public ResponseEntity<List<ZoneEntity>> recupererZones() {
        List<ZoneEntity> zones = zoneService.findAllZone();

        return new ResponseEntity<>(zones, HttpStatus.OK);
    }

}

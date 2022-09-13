package com.apromac.saigneur.controller;

import com.apromac.saigneur.entity.DistrictEntity;
import com.apromac.saigneur.service.DistrictService;
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
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @ApiOperation(value = "Méthode permettant de récupérer un district grace à son ID")
    @GetMapping(value = "/district/findByDistrictID/{districtID}")
    public ResponseEntity<DistrictEntity> recupererUnDistrict(@PathVariable long districtID) {
        Optional<DistrictEntity> districtOptional = districtService.findByDistrictID(districtID);

        return new ResponseEntity<>(districtOptional.get(), HttpStatus.OK);
    }

    @ApiOperation(value = "Méthode permettant de récupérer la liste des districts")
    @GetMapping(value = "/district/findAllDistrict")
    public ResponseEntity<List<DistrictEntity>> recupererDistricts() {
        List<DistrictEntity> districts = districtService.findAllDistrict();

        return new ResponseEntity<>(districts, HttpStatus.OK);
    }

}

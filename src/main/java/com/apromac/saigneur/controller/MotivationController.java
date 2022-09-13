package com.apromac.saigneur.controller;

import com.apromac.saigneur.entity.MotivationEntity;
import com.apromac.saigneur.service.MotivationService;
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
public class MotivationController {

    @Autowired
    private MotivationService motivationService;

    @ApiOperation(value = "Méthode permettant de récupérer une motivation grace à son ID")
    @GetMapping(value = "/motivation/findByMotivationID/{motivationID}")
    public ResponseEntity<MotivationEntity> recupererUneMotivation(@PathVariable long motivationID) {
        Optional<MotivationEntity> motivationOptional = motivationService.findByMotivationID(motivationID);

        return new ResponseEntity<>(motivationOptional.get(), HttpStatus.OK);
    }

    @ApiOperation(value = "Méthode permettant de récupérer la liste des motivations")
    @GetMapping(value = "/motivation/findAllMotivation")
    public ResponseEntity<List<MotivationEntity>> recupererMotivations() {
        List<MotivationEntity> motivations = motivationService.findAllMotivation();

        return new ResponseEntity<>(motivations, HttpStatus.OK);
    }

}

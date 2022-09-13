package com.apromac.saigneur.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "saigneurutilitaire", name = "district")
public class DistrictEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_district", updatable = false, nullable = false)
    private Long districtID;

    @Column(name = "lib_district", nullable = false)
    private String libelleDistrict;

    @Column(name = "abr_district", nullable = false)
    private String abbreviationDistrict;
}

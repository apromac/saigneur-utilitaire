package com.apromac.saigneur.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "saigneurutilitaire", name = "zone")
public class ZoneEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zone", updatable = false, nullable = false)
    private Long zoneID;

    @Column(name = "lib_zone", nullable = false)
    private String libelleZone;

    @ManyToOne
    @JoinColumn(name = "code_district", nullable = false)
    private DistrictEntity district;
}

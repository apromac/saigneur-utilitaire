package com.apromac.saigneur.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "saigneurutilitaire", name = "motivation")
public class MotivationEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_motivation", updatable = false, nullable = false)
    private Long motivationID;

    @Column(name = "desc_motiv", nullable = false)
    private String descriptionMotivation;
}

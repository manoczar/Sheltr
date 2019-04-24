package com.codecool.sheltr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Shelter {

    @Id
    @GeneratedValue
    protected Integer id;

    @Column(nullable = false)
    protected String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    protected String shortDescription;

    @Column(nullable = false, columnDefinition = "TEXT")
    protected String description;

    @Column(nullable = false)
    protected String organisation;





}

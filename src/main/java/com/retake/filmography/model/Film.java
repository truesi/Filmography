package com.retake.filmography.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "films")
public @Data
class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;

    @Column(name = "rating")
    private String rating;

}

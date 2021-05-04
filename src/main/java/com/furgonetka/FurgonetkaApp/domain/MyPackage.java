package com.furgonetka.FurgonetkaApp.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyPackage {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;


}

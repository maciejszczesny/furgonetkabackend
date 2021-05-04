package com.furgonetka.FurgonetkaApp.domain;



import javax.persistence.*;

@Entity
@Table
public class MyPackage {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;

    public MyPackage() {
    }

    public MyPackage(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

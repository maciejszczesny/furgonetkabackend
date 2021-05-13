package com.furgonetka.FurgonetkaApp.domain;
import javax.persistence.*;

@Entity
@Table
public class MyPackage {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer clientNumber;

    public MyPackage() {
    }

    public MyPackage(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientNumber = clientNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getClientNumber() { return clientNumber; }

    public void setClientNumber(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }
}

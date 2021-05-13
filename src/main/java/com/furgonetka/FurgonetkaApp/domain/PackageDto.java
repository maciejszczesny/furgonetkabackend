package com.furgonetka.FurgonetkaApp.domain;

public class PackageDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer clientNumber;

    public PackageDto() {}

    public PackageDto(String firstName, String lastName, Long id, Integer clientNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientNumber = clientNumber;
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

    public Integer getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

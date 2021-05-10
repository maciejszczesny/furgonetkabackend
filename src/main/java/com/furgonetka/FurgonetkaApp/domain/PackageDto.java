package com.furgonetka.FurgonetkaApp.domain;

public class PackageDto {
    private Long id;
    private String firstName;
    private String lastName;

    public PackageDto() {}

    public PackageDto(String firstName, String lastName, Long id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

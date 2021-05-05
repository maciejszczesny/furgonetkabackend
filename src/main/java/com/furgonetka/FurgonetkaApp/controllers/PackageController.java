package com.furgonetka.FurgonetkaApp.controllers;

import com.furgonetka.FurgonetkaApp.domain.MyPackage;
import com.furgonetka.FurgonetkaApp.domain.PackageDto;
import com.furgonetka.FurgonetkaApp.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    public PackageController(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @PostMapping(path = "/packages")
    public String createPackage(@RequestBody PackageDto packageDto) {
        System.out.println("Received Request from frontend!");


        String firstName = packageDto.getFirstName();
        String lastName = packageDto.getLastName();

        MyPackage myPackage = new MyPackage();
        myPackage.setFirstName(firstName);
        myPackage.setLastName(lastName);

        packageRepository.save(myPackage);
        return "Showing packages";
    }

    @GetMapping(path = "/packages")
    public List<PackageDto> getAllPackages() {
        List<PackageDto> packageDtos = new ArrayList<>();
        List<MyPackage> packages = packageRepository.findAll();

        for (MyPackage myPackage : packages) {
            PackageDto packageDto = new PackageDto(myPackage.getFirstName(), myPackage.getLastName());
            packageDtos.add(packageDto);
        }

        return packageDtos;
    }
}

package com.furgonetka.FurgonetkaApp.controllers;

import com.furgonetka.FurgonetkaApp.domain.MyPackage;
import com.furgonetka.FurgonetkaApp.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    public PackageController(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @GetMapping(path = "/packages")
    public String createPackage() {
        System.out.println("Received Request from frontend!");

        MyPackage myPackage = new MyPackage();
        myPackage.setName("testname" + new Random().nextInt());

        packageRepository.save(myPackage);
        return "Showing packages";
    }
}

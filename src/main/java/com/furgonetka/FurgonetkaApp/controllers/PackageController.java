package com.furgonetka.FurgonetkaApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {


    @GetMapping(path = "/packages")
    public String createPackage() {
        System.out.println("Received Request from frontend!");
        return "Showing packages";
    }
}

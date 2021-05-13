package com.furgonetka.FurgonetkaApp.controllers;

import com.furgonetka.FurgonetkaApp.domain.MyPackage;
import com.furgonetka.FurgonetkaApp.domain.PackageDto;
import com.furgonetka.FurgonetkaApp.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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
        Integer clientNumber = packageDto.getClientNumber();

        MyPackage myPackage = new MyPackage();
        myPackage.setFirstName(firstName);
        myPackage.setLastName(lastName);
        myPackage.setClientNumber(clientNumber);


        packageRepository.save(myPackage);
        return "Showing packages";
    }

    @GetMapping(path = "/packages")
    public List<PackageDto> getAllPackages() {
        List<PackageDto> packageDtos = new ArrayList<>();
        List<MyPackage> packages = packageRepository.findAll();

        for (MyPackage myPackage : packages) {
            PackageDto packageDto = new PackageDto(myPackage.getFirstName(), myPackage.getLastName(), myPackage.getId(), myPackage.getClientNumber());
            packageDtos.add(packageDto);
        }
        return packageDtos;
    }

    @DeleteMapping(path = "/packages/{id}")
    public void deletePackage(@PathVariable String id) {

        packageRepository.deleteById(Long.valueOf(id));
    }


    @GetMapping(path = "/myPackages/{clientNumber}")
    public List <PackageDto> getClientPackages(@PathVariable String clientNumber){
        List<PackageDto> packageDtos = new ArrayList<>();
        List<MyPackage> packages = packageRepository.findAllByClientNumber(Integer.valueOf(clientNumber));

        for (MyPackage myPackage : packages) {
            PackageDto packageDto = new PackageDto(myPackage.getFirstName(), myPackage.getLastName(), myPackage.getId(), myPackage.getClientNumber());
            packageDtos.add(packageDto);
        }
        return packageDtos;

    }

}

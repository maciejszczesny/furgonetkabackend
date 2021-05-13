package com.furgonetka.FurgonetkaApp.repository;

import com.furgonetka.FurgonetkaApp.domain.MyPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PackageRepository extends JpaRepository<MyPackage, Long> {
    List<MyPackage> findAllByClientNumber(Integer clientNumber);
}

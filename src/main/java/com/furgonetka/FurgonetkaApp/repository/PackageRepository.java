package com.furgonetka.FurgonetkaApp.repository;

import com.furgonetka.FurgonetkaApp.domain.MyPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<MyPackage, Long> {


}

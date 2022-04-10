package com.finalproject.carapp.repository;

import com.finalproject.carapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "car", path = "car")
public interface CarRepository extends JpaRepository<Car, Long> {

    // Fetch cars by brand
    List<Car> findByBrand(String brand);

    // Fetch cars by color
    List<Car> findByColor(String color);

    // Fetch cars by year
    List<Car> findByYear(int year);

    // Fetch cars by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    // Fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);

    // Fetch cars by brand and sort by year ascending
    List<Car> findByBrandOrderByYearAsc(String brand);

    // Fetch cars by brand and sort by year descending
    List<Car> findByBrandOrderByYearDesc(String brand);

    // Fetch cars by brand using JPA Query annotation
    @Query("select c from Car c where c.brand = ?1")
    List<Car> getCarsByBrand(String brand);

    // Fetch cars by brand using JPA Query ends with parameter
    @Query("select c from Car c where c.brand like %?1")
    List<Car> getCarsByBrandEndLike(String brand);

    // Fetch cars by brand using JPA Query starts with parameter
    @Query("select c from Car c where c.brand like %?1")
    List<Car> getCarsByBrandStartLike(String brand);

    // Fetch cars by brand using JPA Query contains parameter
    @Query("select c from Car c where c.brand like %?1%")
    List<Car> getCarsByBrandContainLike(String brand);
}

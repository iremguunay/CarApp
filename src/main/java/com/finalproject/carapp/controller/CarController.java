package com.finalproject.carapp.controller;

import com.finalproject.carapp.entity.Car;
import com.finalproject.carapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

}

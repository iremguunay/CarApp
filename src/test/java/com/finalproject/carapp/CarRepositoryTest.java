package com.finalproject.carapp;

import com.finalproject.carapp.entity.Car;
import com.finalproject.carapp.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@DataJpaTest
class CarRepositoryTests {

    @Autowired
    private CarRepository carRepository;

    @Test
    void testCarSave()
    {
        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000);
        carRepository.save(car);
        assertThat(car.getId()).isNotNull();
    }


    @Test
    public void testDeleteCars() {

        carRepository.deleteAll();
        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000);
        carRepository.save(car);
        //assertThat(carRepository.findAll()).isEmpty();
        assertEquals(carRepository.count(),1);
    }

}

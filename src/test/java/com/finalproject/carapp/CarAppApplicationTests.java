package com.finalproject.carapp;

import com.finalproject.carapp.controller.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CarAppApplicationTests {

    @Autowired
    private CarController carController;

    @Test
    void contextLoads() {
        assertThat(carController).isNotNull();
    }
}

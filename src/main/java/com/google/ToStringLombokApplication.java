package com.google;

import com.google.vehcle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToStringLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToStringLombokApplication.class, args);

        Car car = new Car("1","Honda","Civic");
        System.out.println(car.toString());
    }

}

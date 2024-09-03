package com.google.vehcle;

import lombok.ToString;

@ToString
public class Car {
    private String id;
    private String make;
    private String model;

    public Car(String id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "id='" + id + '\'' +
//                ", make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                '}';
//    }

}

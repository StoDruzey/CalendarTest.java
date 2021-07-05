package Lesson07;

import java.time.LocalDate;

public class Car {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String type;
    Double engineVolume;
    String color;
    String model;
    Integer maxSpeed;
    LocalDate manufactureDate;

//    public Car() {
//
//    }


    public Car(String type, Double engineVolume, String color, String model, Integer maxSpeed, LocalDate manufactureDate) {
        this.type = type;
        this.engineVolume = engineVolume;
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.manufactureDate = manufactureDate;
    }

    void start() {

    }
    void stop() {

    }
    void signal() {

    }
    void drive() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}

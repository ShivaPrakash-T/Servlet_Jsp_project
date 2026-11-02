package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Car {
    @Id
    private Integer carId;
    private String carModel;
    private String carBrand;
    private String carColor;
    private Integer carPrice;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }
}

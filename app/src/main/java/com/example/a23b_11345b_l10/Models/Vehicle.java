package com.example.a23b_11345b_l10.Models;

public class Vehicle {
    public enum eType {
        NA,
        GASOLINE,
        DIESEL,
        HYBRID,
        ELECTRIC
    }

    private int manufactureYear = 0;
    private String licensePlate = "";
    private int wheelCount = 0;
    private long price = 0;
    private eType type = eType.NA;
    private String brand = "";

    public Vehicle() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public Vehicle setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
        return this;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Vehicle setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public Vehicle setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public Vehicle setPrice(long price) {
        this.price = price;
        return this;
    }

    public eType getType() {
        return type;
    }

    public Vehicle setType(eType type) {
        this.type = type;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufactureYear=" + manufactureYear +
                ", licensePlate='" + licensePlate + '\'' +
                ", wheelCount=" + wheelCount +
                ", price=" + price +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                '}';
    }
}

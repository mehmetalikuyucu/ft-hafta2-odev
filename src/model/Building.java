package model;

import model.enums.HomeType;


public class Building {
        private final HomeType homeType;
        private final double price;
        private final double m2;
        private final int roomCount;
        private final int hallCount;

    public Building(HomeType homeType, double price, double m2, int roomCount, int hallCount) {
        this.homeType = homeType;
        this.price = price;
        this.m2 = m2;
        this.roomCount = roomCount;
        this.hallCount = hallCount;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public double getPrice() {
        return price;
    }

    public double getM2() {
        return m2;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getHallCount() {
        return hallCount;
    }
}

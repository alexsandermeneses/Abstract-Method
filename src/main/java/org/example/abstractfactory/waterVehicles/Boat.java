package org.example.abstractfactory.waterVehicles;

public class Boat implements IWaterVehicles{
    @Override
    public void startRoute() {
        sea();
        getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("Take");
    }

    @Override
    public void sea() {
        System.out.println("Sea Ok");
    }
}
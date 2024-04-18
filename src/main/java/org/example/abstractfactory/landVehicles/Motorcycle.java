package org.example.abstractfactory.landVehicles;

public class Motorcycle implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("We take the order");
    }

    @Override
    public void traffic() {
        System.out.println("Ok");
    }
}
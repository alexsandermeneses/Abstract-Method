package org.example.abstractfactory.landVehicles;

public class Car implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("We pick up the passengers");
    }

    @Override
    public void traffic() {
        System.out.println("Ok");
    }
}

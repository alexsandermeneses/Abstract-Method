package org.example.abstractfactory.airCrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("Passengers ok");
    }

    @Override
    public void wind() {
        System.out.println("Wind Ok");
    }
}
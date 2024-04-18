package org.example.abstractfactory.airCrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Starting takeoff");
    }

    @Override
    public void getCargo() {
        System.out.println("Passengers on board");
    }

    @Override
    public void wind() {
        System.out.println("Wind ok");
    }
}
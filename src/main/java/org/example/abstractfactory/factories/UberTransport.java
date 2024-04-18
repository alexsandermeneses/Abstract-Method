package org.example.abstractfactory.factories;

import org.example.abstractfactory.airCrafts.Airplane;
import org.example.abstractfactory.airCrafts.IAircraft;
import org.example.abstractfactory.landVehicles.Car;
import org.example.abstractfactory.landVehicles.ILandVehicles;

public class UberTransport implements ITransportFactory{

    @Override
    public ILandVehicles createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
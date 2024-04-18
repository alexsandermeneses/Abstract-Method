package org.example.abstractfactory.factories;

import org.example.abstractfactory.airCrafts.Helicopter;
import org.example.abstractfactory.airCrafts.IAircraft;
import org.example.abstractfactory.landVehicles.ILandVehicles;
import org.example.abstractfactory.landVehicles.Motorcycle;

public class NineNine implements ITransportFactory{
    @Override
    public ILandVehicles createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
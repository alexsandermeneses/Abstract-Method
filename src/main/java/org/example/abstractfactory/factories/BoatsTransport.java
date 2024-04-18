package org.example.abstractfactory.factories;

import org.example.abstractfactory.waterVehicles.Boat;
import org.example.abstractfactory.waterVehicles.IWaterVehicles;

public class BoatsTransport implements IWaterTransportFactory{
    @Override
    public IWaterVehicles createWaterTransport() {
        return new Boat();
    }
}
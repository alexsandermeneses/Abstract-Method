package org.example.abstractfactory.factories;

import org.example.abstractfactory.waterVehicles.IWaterVehicles;

public interface IWaterTransportFactory {
    IWaterVehicles createWaterTransport();
}
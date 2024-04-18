package org.example.abstractfactory.factories;

import org.example.abstractfactory.airCrafts.IAircraft;
import org.example.abstractfactory.landVehicles.ILandVehicles;

public interface ITransportFactory {
    ILandVehicles createTransportVehicle();
    IAircraft createTransportAircraft();
}

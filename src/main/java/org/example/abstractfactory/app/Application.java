package org.example.abstractfactory.app;

import org.example.abstractfactory.airCrafts.IAircraft;
import org.example.abstractfactory.factories.ITransportFactory;
import org.example.abstractfactory.factories.IWaterTransportFactory;
import org.example.abstractfactory.landVehicles.ILandVehicles;
import org.example.abstractfactory.waterVehicles.IWaterVehicles;

public class Application {

    private  ILandVehicles vehicles;
    private  IAircraft aircraft;
    private  IWaterVehicles waterVehicles;

    public Application(ITransportFactory factory){
        vehicles = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public Application(IWaterTransportFactory waterFactory){
        waterVehicles = waterFactory.createWaterTransport();
    }

    public void startRoute(){
        if (vehicles != null) {
            vehicles.startRoute();
        }
        if (aircraft != null){
            aircraft.startRoute();
        }
        if (waterVehicles != null) {
            waterVehicles.startRoute();
        }
    }
}

package org.example.abstractfactory;

import org.example.abstractfactory.Enum.Companies;
import org.example.abstractfactory.app.Application;
import org.example.abstractfactory.factories.*;

public class Main {

    public static Application configureApplication(){
        Application application = null;
        ITransportFactory landAndAndAirFactory = null;
        IWaterTransportFactory waterFactory = null;

        Companies company = Companies.BOAT;

        switch (company) {
            case UBER:
                landAndAndAirFactory= new UberTransport();
                application = new Application(landAndAndAirFactory);
                break;
            case NINENINE:
                landAndAndAirFactory = new NineNine();
                application = new Application(landAndAndAirFactory);
                break;
            case BOAT:
                waterFactory = new BoatsTransport();
                application = new Application(waterFactory);
                break;
        }

        return application;
    }

    public static void main(String[] args) {

        Application application = configureApplication();

        application.startRoute();
    }
}
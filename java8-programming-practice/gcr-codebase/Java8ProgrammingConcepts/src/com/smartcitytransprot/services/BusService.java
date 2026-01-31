package com.smartcitytransprot.services;

import com.smartcitytransprot.interfaces.TransportService;

public class BusService implements TransportService {

    @Override
    public String getServiceName() {
        return "City Bus";
    }

    @Override
    public double getFare() {
        return 20.0;
    }
}

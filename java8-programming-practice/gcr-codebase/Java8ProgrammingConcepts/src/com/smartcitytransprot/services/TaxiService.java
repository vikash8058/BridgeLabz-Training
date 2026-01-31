package com.smartcitytransprot.services;

import com.smartcitytransprot.interfaces.TransportService;

public class TaxiService implements TransportService {

    @Override
    public String getServiceName() {
        return "City Taxi";
    }

    @Override
    public double getFare() {
        return 60.0;
    }
}

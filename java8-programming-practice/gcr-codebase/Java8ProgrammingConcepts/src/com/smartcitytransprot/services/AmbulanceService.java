package com.smartcitytransprot.services;

import com.smartcitytransprot.interfaces.EmergencyService;
import com.smartcitytransprot.interfaces.TransportService;

public class AmbulanceService
        implements TransportService, EmergencyService {

    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    @Override
    public double getFare() {
        return 0.0;
    }
}

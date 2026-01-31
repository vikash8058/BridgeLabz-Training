package com.smartcitytransprot;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.smartcitytransprot.interfaces.EmergencyService;
import com.smartcitytransprot.interfaces.FareCalculator;
import com.smartcitytransprot.interfaces.TransportService;
import com.smartcitytransprot.model.PassengerTrip;
import com.smartcitytransprot.model.TransportSchedule;
import com.smartcitytransprot.services.AmbulanceService;
import com.smartcitytransprot.services.BusService;
import com.smartcitytransprot.services.MetroService;
import com.smartcitytransprot.services.TaxiService;

public class SmartCityDashboard {

    public static void main(String[] args) {

        /* ----------------- Transport Services ----------------- */
        List<TransportService> services = Arrays.asList(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        // Live dashboard update
        services.forEach(TransportService::printServiceDetails);

        System.out.println();

        /* ----------------- Emergency Detection ----------------- */
        services.forEach(service -> {
            if (service instanceof EmergencyService) {
                System.out.println(
                        service.getServiceName()
                                + " has traffic priority!"
                );
            }
        });

        System.out.println();

        /* ----------------- Schedules (Lambda + Sorting) ----------------- */
        List<TransportSchedule> schedules = Arrays.asList(
                new TransportSchedule("Bus", LocalTime.of(9, 30), 20),
                new TransportSchedule("Metro", LocalTime.of(9, 0), 35),
                new TransportSchedule("Taxi", LocalTime.of(8, 45), 60)
        );

        schedules.stream()
                .sorted(Comparator.comparing(
                        TransportSchedule::getDepartureTime))
                .forEach(System.out::println);

        System.out.println();

        /* ----------------- Passenger Trips (Collectors) ----------------- */
        List<PassengerTrip> trips = Arrays.asList(
                new PassengerTrip("Route-A", 20, true),
                new PassengerTrip("Route-B", 35, false),
                new PassengerTrip("Route-A", 20, true),
                new PassengerTrip("Route-C", 60, false)
        );

        // Group by route
        Map<String, List<PassengerTrip>> byRoute =
                trips.stream()
                        .collect(Collectors.groupingBy(
                                PassengerTrip::getRoute));

        // Revenue summary
        DoubleSummaryStatistics revenueStats =
                trips.stream()
                        .collect(Collectors.summarizingDouble(
                                PassengerTrip::getFare));

        System.out.println("Trips by Route: " + byRoute.keySet());
        System.out.println("Total Revenue: " + revenueStats.getSum());
        System.out.println("Average Fare: " + revenueStats.getAverage());

        System.out.println();

        /* ----------------- Fare Calculator (Functional Interface) -------- */
        FareCalculator taxiFare =
                distance -> distance * 12;

        System.out.println(
                "Taxi Fare for 10km: "
                        + taxiFare.calculateFare(10)
        );
    }
}

package com.ambulanceroute;

public class AmbulanceRouteApp {

	public static void main(String[] args) {

		RouteManager route = new RouteManager();

		route.addUnit("Emergency", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", false);
		route.addUnit("ICU", true);

		route.findAvailableUnit();

		route.removeUnit("Surgery");

		route.findAvailableUnit();
	}
}

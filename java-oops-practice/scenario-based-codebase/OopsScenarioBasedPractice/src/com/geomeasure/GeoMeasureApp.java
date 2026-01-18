package com.geomeasure;

public class GeoMeasureApp {
	public static void main(String[] args) {
		LineComparator comparator = new LineComparator();

		// create line objects
		Line line1 = new Line(0, 0, 4, 3);
		Line line2 = new Line(1, 1, 5, 4);

		comparator.compare(line1, line2);
	}
}

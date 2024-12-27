package org.example.GeometryLibrary.utils;

public class GeometryUtils {

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static int compareAreas(double area1, double area2) {
        return Double.compare(area1, area2);
    }
}

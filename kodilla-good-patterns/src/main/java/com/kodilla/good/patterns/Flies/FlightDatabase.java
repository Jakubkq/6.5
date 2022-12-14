package com.kodilla.good.patterns.Flies;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
    private static final String WAW = "Warszawa";
    private static final String LUB = "Lublin";
    private static final String KRA = "Kraków";
    private static final String GD = "Gdańsk";
    private static final String WR = "Wrocław";
    private static final String LOD = "Łódź";
    private static final String RZE = "Rzeszów";

    private static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(WAW, LUB));
        flightSet.add(new Flight(WAW, KRA));
        flightSet.add(new Flight(WAW, GD));
        flightSet.add(new Flight(WAW, WR));
        flightSet.add(new Flight(WAW, LOD));
        flightSet.add(new Flight(LOD, WAW));
        flightSet.add(new Flight(LOD, RZE));
        flightSet.add(new Flight(LOD, WR));
        flightSet.add(new Flight(WR, KRA));
        flightSet.add(new Flight(WR, GD));
        flightSet.add(new Flight(WR, WAW));
        flightSet.add(new Flight(LUB, WAW));
        flightSet.add(new Flight(LUB, RZE));
    }

    public static Set<Flight> accessToSet() {
        return new HashSet<>(flightSet);
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightSet=" + flightSet +
                '}';
    }
}

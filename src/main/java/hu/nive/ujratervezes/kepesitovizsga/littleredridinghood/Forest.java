package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Forest {

    public static ArrayList<Forest> playersOfTheTale = new ArrayList<>(Arrays.asList(new LittleRedRidingHood("Piroska"), new Wolf("Farkas"), new Grandma("Nagymama"), new Hunter("Vadász")));
    private String name;

    public Forest(String name) {
        this.name = name;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forest forest = (Forest) o;

        return name != null ? name.equals(forest.name) : forest.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

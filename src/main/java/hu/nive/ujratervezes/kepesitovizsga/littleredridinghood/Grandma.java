package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

public class Grandma extends Forest{
    public Grandma(String name) {
        super(name);
    }

    @Override
    public void eat() {
        LittleRedRidingHood.cake -= 2;
    }
}

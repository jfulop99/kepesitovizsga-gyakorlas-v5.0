package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

public class LittleRedRidingHood extends Forest{


    public static int cake = 10;

    @Override
    public void eat() {
        cake--;
    }

    public LittleRedRidingHood(String name) {
        super(name);
    }
}

package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

public class Hunter extends Forest{
    public Hunter(String name) {
        super(name);
    }

    @Override
    public void eat() {
        Forest.playersOfTheTale.removeIf(item -> item.getName().equals("Farkas"));
        Forest.playersOfTheTale.add(new Grandma("Nagymama"));
        Forest.playersOfTheTale.add(new LittleRedRidingHood("Piroska"));
        LittleRedRidingHood.cake -= 3;
    }
}

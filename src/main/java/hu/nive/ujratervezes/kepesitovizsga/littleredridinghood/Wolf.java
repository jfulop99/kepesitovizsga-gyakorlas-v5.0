package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

public class Wolf extends Forest{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void eat() {
        Forest.playersOfTheTale.removeIf(item -> item.getName().equals("Piroska") || item.getName().equals("Nagymama"));
    }
}

package hu.nive.ujratervezes.kepesitovizsga.frogprince;

public class PlayerOfTale {
    private String name;
    private int age;
    private Tale tale;

    public PlayerOfTale(String name, int age, Tale tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Tale getTale() {
        return tale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerOfTale that = (PlayerOfTale) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return tale == that.tale;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (tale != null ? tale.hashCode() : 0);
        return result;
    }
}

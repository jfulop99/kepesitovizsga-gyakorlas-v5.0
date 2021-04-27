package hu.nive.ujratervezes.kepesitovizsga.snowwhite;

public class Dwarf {
    String name;
    int age;

    public Dwarf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dwarf dwarf = (Dwarf) o;

        if (age != dwarf.age) return false;
        return name != null ? name.equals(dwarf.name) : dwarf.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

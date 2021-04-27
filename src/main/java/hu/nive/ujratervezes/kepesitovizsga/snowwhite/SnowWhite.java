package hu.nive.ujratervezes.kepesitovizsga.snowwhite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SnowWhite {
    private List<Dwarf> sevenDwarfs;

    public SnowWhite(List<Dwarf> sevenDwarfs) {
        this.sevenDwarfs = new ArrayList<>(sevenDwarfs);
    }

    public List<Dwarf> getSevenDwarfs() {
        return new ArrayList<>(sevenDwarfs);
    }

    public List<Dwarf> getSevenDwarfsOrderedByNames() {
        return sevenDwarfs.stream().sorted(Comparator.comparing(Dwarf::getName)).collect(Collectors.toList());
    }

    public List<Dwarf> getSevenDwarfsOrderedByAges() {
        return sevenDwarfs.stream().sorted(Comparator.comparing(Dwarf::getAge)).collect(Collectors.toList());
    }
}

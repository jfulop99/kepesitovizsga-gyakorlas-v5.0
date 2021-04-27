package hu.nive.ujratervezes.kepesitovizsga.sleepingbeauty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SleepingBeauty {


    public Map<Character, Integer> countCharacters(String path) {

        try (Stream<String> stringStream = new BufferedReader(new InputStreamReader(SleepingBeauty.class.getResourceAsStream("/" + path))).lines()){
            return stringStream
                    .map(String::toLowerCase)
                    .flatMap(str -> str.chars().mapToObj(c -> (char)c))
                    .filter(Character::isAlphabetic)
                    .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
        }
    }
}

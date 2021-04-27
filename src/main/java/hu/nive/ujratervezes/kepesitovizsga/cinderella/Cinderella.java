package hu.nive.ujratervezes.kepesitovizsga.cinderella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cinderella {
    private int[] numbers = new int[5];
    String[] find = {"Hamupipőke", "galamb", "királyfi", "mostoha", "cipő"};

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Cinderella.class.getResourceAsStream("/cinderella/cinderella.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file");
        }
    }

    private void processLine(String line) {
        String[] words = line.split(" ");
        for (String item:words) {
            for (int i = 0; i < find.length; i++) {
                if (item.toUpperCase().contains(find[i].toUpperCase())) {
                    numbers[i]++;
                }
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public Object[] getMax() {
        Object[] result = new Object[2];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                result[1] = max;
                result[0] = find[i];
            }
        }
        return result;
    }
}

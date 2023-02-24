package com.javastream;

import java.util.Arrays;

public class LetterCountTest {
    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive();
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
       return Arrays.stream(names)
                .filter(name->name.length()>5) //Stream<String>
                .mapToInt(String::length) // Stream<Integer>
                .sum();

    }
}

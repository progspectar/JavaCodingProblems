package com.core;

import com.core.CountDuplicateCharacters.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
private static final String TEXT = "Test text";

    public static void main(String[] args) {
        // write your code here
        System.out.println("HashMap based solution:");

        Map<Character, Integer> duplicatesV1 = Strings.countDuplicateCharactersV1(TEXT);
        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));


    }

}

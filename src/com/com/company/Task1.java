package com.company;

import java.util.HashMap;

public class Task1 {
    public static HashMap<Character, Integer> getNumberOfLetters(String line) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] strArray = line.toCharArray();
        int letterCount = 0;
        for (char c : strArray) {

            if (Character.isLetter(c)) {
                letterCount++;
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.print("Number of individual letters: ");
        return map;
    }

    public static int getQuantityLetters(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i)))
                counter++;
        }
        System.out.print("Number of letters: ");
        return counter;
    }

    public static int getNumberOfSpaces(String line) {
        int spaceCount = 0;
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.print("Number of spaces: ");
        return spaceCount;
    }

    public static int getNumberPunctuationMarks(String line) {
        int punctuationCount = 0;
        for (char c : line.toCharArray()) {
            if (c == '.' || c == ',' || c == ';' || c == ':' || c == '?' || c == '!' || c == '-') {
                punctuationCount++;
            }
        }
        System.out.print("Number of punctuation marks: ");
        return punctuationCount;
    }

    public static int getNumberOfNumbers(String line) {
        int countnum = 0;
        String[] sarr = line.split(" ");
        for (String str : sarr) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                countnum++;
            }
        }
        System.out.print("Number of numbers: ");
        return sarr.length - countnum;
    }
}

package com.company;

import java.util.HashMap;

import static com.company.Task1.*;

public class Main {
    public static void main(String[] args) {
        String line = "Story: Substance, Structure, Style and the Principles of Screenwriting, a 1997 screenwriting guide by Robert McKee";
        System.out.println(getNumberOfLetters(line));
        System.out.println(getQuantityLetters(line));
        System.out.println(getNumberOfSpaces(line));
        System.out.println(getNumberPunctuationMarks(line));
        System.out.println(getNumberOfNumbers(line));
    }
}



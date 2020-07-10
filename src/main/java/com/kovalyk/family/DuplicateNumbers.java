package com.kovalyk.family;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static Object duplicatesRemoving;

    public static void outputUnique() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Numbers with repeater: ");
        for (Integer e : Arrays.stream(
                scanner.nextLine()
                        .replaceAll(" ", "")
                        .split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet())) {
            System.out.print(e + " ");
        }
        break;
    }
}
}

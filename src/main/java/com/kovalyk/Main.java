package com.kovalyk;

import com.kovalyk.family.DuplicateNumbers;
import com.kovalyk.family.EmblemComparator;
import com.kovalyk.family.Family;
import com.kovalyk.family.TitleComparator;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DuplicateNumbers.outputUnique();

        Family Bondaruk = new Family("Bondaruk", 3, "Barones", "Halychany");
        Family Kovalyk = new Family("Kovalyk", 5, "Elf", "Will");
        Family Malets = new Family("Malets", 4, "Unic", "Purity");
        Family Kozak = new Family("Kozak", 6, "Boyary", "Sitch");

        System.out.println();

        Map<Integer, Family> mapOfFamily = new HashMap<>();
        mapOfFamily.put(3, Bondaruk);
        mapOfFamily.put(4, Kovalyk);
        mapOfFamily.put(2, Malets);
        mapOfFamily.put(1, Kozak);
        System.out.println("Comparable, two elements: " + Bondaruk.compareTo(Kovalyk));
        EmblemComparator comparatorNameOfEmblem = new EmblemComparator();
        System.out.println("Comparator length name of emblem: " + comparatorNameOfEmblem.compare(Malets, Kozak));
        TitleComparator comparatorLengthTitle = new TitleComparator();
        System.out.println("Comparator length title: " + comparatorLengthTitle.compare(Kovalyk, Kozak));

        Map<Integer, Family> mapTree = new TreeMap<>(mapOfFamily);
        System.out.print("Collection sorted in natural order: ");
        for (Entry<Integer, Family> entry : mapTree.entrySet()) {
            Integer key = entry.getKey();
            System.out.print(key);
        }

        System.out.println();

        System.out.println("Collection sorted by value: ");
        mapOfFamily.entrySet()
                .stream()
                .sorted(Entry.<Integer, Family>comparingByValue())
                .forEach(System.out::println);
    }
}

package com.kovalyk.family;

import java.util.Comparator;

public class EmblemComparator implements Comparator<Family> {
    public int compare(Family fam1, Family fam2) {
        return fam2.getNameOfEmblem().compareTo(fam1.getNameOfEmblem());
    }
}

package com.kovalyk.family;

import java.util.Comparator;

public class TitleComparator implements Comparator<Family> {
    public int compare(Family fam1, Family fam2) {
        return fam2.getTitle().compareTo(fam1.getTitle());
    }
}

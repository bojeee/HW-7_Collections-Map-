package com.kovalyk.family;

public class Family implements Comparable<Family> {
        private String name;
        private int quantityMember;
        private String title;
        private String nameOfEmblem;


        public Family(String name, int quantityMember, String title, String nameOfEmblem) {
            this.name = name;
            this.nameOfEmblem = nameOfEmblem;
            this.quantityMember = quantityMember;
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public String getNameOfEmblem() {
            return nameOfEmblem;
        }

        @Override
        public int compareTo(Family family) {
            return this.name.compareTo(family.title);
        }
}

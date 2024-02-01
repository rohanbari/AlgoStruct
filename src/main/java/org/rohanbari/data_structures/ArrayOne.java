/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.data_structures;

public class ArrayOne {
//    /**
//     * The main method.
//     *
//     * @param args System arguments
//     */
//    public static void main(String[] args) {
//        DVD[] dvds = {
//                new DVD("A", "a", 2003),
//                new DVD("B", "b", 2005),
//                new DVD("C", "c", 2008),
//                new DVD("D", "d", 2015),
//                new DVD("E", "e", 2024),
//        };
//
//        System.out.println("Total array length: " + dvds.length);
//
//        for (var dvd : dvds) {
//            System.out.println(dvd);
//        }
//    }

    static class DVD {

        private final String name;
        private final String authoredBy;
        private final int releaseYear;

        public DVD(String name, String authoredBy, int releaseYear) {
            this.name = name;
            this.authoredBy = authoredBy;
            this.releaseYear = releaseYear;
        }

        @Override
        public String toString() {
            return String.format("Movie %s was authored by %s in %d.",
                    name, authoredBy, releaseYear);
        }
    }
}

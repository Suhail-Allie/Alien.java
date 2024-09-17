package org.example;

    public class CreateAliens {
        public static void main(String[] args) {
            // Instantiate one Martian and one Jupiterian
            Martian martian = new Martian();
            Jupiterian jupiterian = new Jupiterian();

            // Call toString() method and display the results
            System.out.println("Martian Description:");
            System.out.println(martian.toString());
            System.out.println();

            System.out.println("Jupiterian Description:");
            System.out.println(jupiterian.toString());
        }
    }



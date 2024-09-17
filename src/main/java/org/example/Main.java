package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Alien
    public abstract class Alien {
        // Protected data members
        protected int numberOfEyes;
        protected String color;
        protected int numberOfLimbs;

        // Constructor to initialize the data members
        public Alien(int numberOfEyes, String color, int numberOfLimbs) {
            this.numberOfEyes = numberOfEyes;
            this.color = color;
            this.numberOfLimbs = numberOfLimbs;
        }

        // toString() method to return a complete description of the Alien
        @Override
        public String toString() {
            return "Alien Description:\n" +
                    "Number of Eyes: " + numberOfEyes + "\n" +
                    "Color: " + color + "\n" +
                    "Number of Limbs: " + numberOfLimbs;
        }
    }

    //Martian
    public class Martian extends org.example.Alien {

        // Constructor for Martian
        public Martian() {
            super(4, "Green", 6); // Example values: 4 eyes, green color, 6 limbs
        }
    }

    //Jupiterian
    public class Jupiterian extends org.example.Alien {

        // Constructor for Jupiterian
        public Jupiterian() {
            super(2, "Blue", 8); // Example values: 2 eyes, blue color, 8 limbs
        }
    }

    //CreateAliens
    public class CreateAliens {
        public static void main(String[] args) {
            // Instantiate one Martian and one Jupiterian
            org.example.Martian martian = new org.example.Martian();
            org.example.Jupiterian jupiterian = new org.example.Jupiterian();

            // Call toString() method and display the results
            System.out.println("Martian Description:");
            System.out.println(martian.toString());
            System.out.println();

            System.out.println("Jupiterian Description:");
            System.out.println(jupiterian.toString());
        }
    }



}
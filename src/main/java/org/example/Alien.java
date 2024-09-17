package org.example;

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


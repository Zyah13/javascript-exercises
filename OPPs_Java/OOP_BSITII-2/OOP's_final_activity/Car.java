/*
 *Problem:Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
     ◦intweight;
     ◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.
 * Name :  Jieya O. Lingaolingao
 * Year&SEc.: BSIT 2-2
 *@Truck.java
 *#FinalsActivity4
 */

// Class Car, subclass Truck
class Car {
    int speed;
    double regularPrice;
    String colour;

    public Car(int speed, double regularPrice, String colour) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.colour = colour;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

// Truck class, subclass of Car
class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String colour, int weight) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    // Override getSalePrice method
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            double discountPrice = super.regularPrice * 0.10; // 10% discount
            return (super.regularPrice - discountPrice);
        } else {
            double discountPrice = super.regularPrice * 0.20; // 20% discount
            return (super.regularPrice - discountPrice);
        }
    }
    public static void main(String[] args) {
        // Create Truck object
        Truck myTruck = new Truck(60, 25000, "Blue", 3000);

        // Accessing properties and methods from Car and Truck classes
        System.out.println("Car Information - Speed: " + myTruck.speed + ", Regular Price: " + myTruck.regularPrice
                + ", Colour: " + myTruck.colour);
        System.out.println("Truck Information - Weight: " + myTruck.weight);
        System.out.println("Sale Price: " + myTruck.getSalePrice());
    }
}
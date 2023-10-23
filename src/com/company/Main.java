package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cars.dat"));
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("cars2.dat"));
            Car bmw = new Car("BMW", 250, 125000);
            Car audi = new Car("Audi", 270, 150000);
            oos.writeObject(bmw);
            oos2.writeObject(audi);
        }
        catch (Exception e)
        {
            e.getMessage();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cars.dat"));
            Car bmw2 = (Car) ois.readObject();
            System.out.println(bmw2.getBrand() + " " + bmw2.getSpeed() + " " + bmw2.getPrice());

            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("cars2.dat"));
            Car audi2 = (Car) ois2.readObject();
            System.out.println(audi2.getBrand() + " " + audi2.getSpeed() + " " + audi2.getPrice());
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}

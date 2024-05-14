package com.pluralsight;

import java.util.Scanner;

public class MainVehicle
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car car = new Car();
        SemiTruck semiTruck = new SemiTruck();
        Hovercraft hovercraft = new Hovercraft();
        Moped moped = new Moped();

        System.out.print("""
                What type of Vehicle do you have: 
                1. Car
                2. SemiTruck
                3. HoverCraft
                4. Moped
                                
                Answer: 
                """);
        int choice = scanner.nextInt();
        scanner.nextLine();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.print("Whats the name of the car?");
                    String name = scanner.nextLine();
                    car.setName(name);
                    System.out.println(car.getName());
                    System.exit(0);
                case 2:
                    System.out.print("Whats the name of the SemiTruck?");
                    String semiName = scanner.nextLine();
                    semiTruck.setName(semiName);
                    System.out.println(semiTruck.getName());
                    System.exit(0);
                case 3:
                    System.out.print("Whats the name of the HoverCraft?");
                    String hoverName = scanner.nextLine();
                    hovercraft.setName(hoverName);
                    System.out.println(hovercraft.getName());
                    System.exit(0);
                case 4:
                    System.out.print("Whats the name of the Moped?");
                    String mopedName = scanner.nextLine();
                    moped.setName(mopedName);
                    System.out.println(moped.getName());
                    System.exit(0);
                default:
                    System.out.println("Wrong try again");
            }
        }
    }
}

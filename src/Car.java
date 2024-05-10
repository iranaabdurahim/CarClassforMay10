import java.util.Scanner;

public class Car extends Vehicle {
    int fuelCapacity = 60;

       public Car(String brand, String model, int mileage, int fuelCapacity) {
        super(brand, model, mileage);
        this.fuelCapacity = fuelCapacity;
    }

    public int addFuel(Scanner s) {

        System.out.println("Nece litr benzin elave olunsun?");
        int capacity = s.nextInt();
        if (capacity < fuelCapacity)
            System.out.println(capacity + " litr benzin elave edildi.");
        else System.out.println("Çəninizdə kifayət qədər benzin var.");

        return capacity;
    }
}

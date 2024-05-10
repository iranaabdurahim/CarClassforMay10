import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Car c = new Car("Opel", "Vectra", 400000, 60);

        c.addFuel(s);


    }
}
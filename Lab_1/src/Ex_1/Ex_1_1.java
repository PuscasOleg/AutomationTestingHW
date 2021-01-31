package Ex_1;

import java.util.Scanner;

public class Ex_1_1 {
    public static void main(String[] args) {
        double Fahrenheit;

        System.out.println("Enter a degree in Celsius:");
        Scanner scanner = new Scanner(System.in);
        Double Celsius = scanner.nextDouble();
        Fahrenheit=1.8*Celsius+32;
        System.out.println(Celsius+" Celsius in "+Fahrenheit+" Fahrenheit");

    }

}
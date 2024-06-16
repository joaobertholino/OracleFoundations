package application;

import model.entities.ComputeMethods;

public class App {

    public static void main(String[] args) {
        System.out.println("Fahrenheit para Celsius: " + ComputeMethods.exOne(32));
        System.out.printf("Hipotenusa: %.2f%n", ComputeMethods.exTwo(10, 20));
        System.out.println("Soma do valor de dois dados de seis lados: " + ComputeMethods.exThree());
    }
}

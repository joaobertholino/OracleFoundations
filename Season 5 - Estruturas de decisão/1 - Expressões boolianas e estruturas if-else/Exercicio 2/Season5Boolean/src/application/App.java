package application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(exOne(in));
        System.out.println(exTwo(in));
    }

    public static boolean exOne(Scanner in) {
        System.out.print("Insira sua idade: ");
        int age = in.nextInt();
        in.nextLine();

        boolean drivingUnderAge = false;

        if (age >= 18) {
            drivingUnderAge = true;
            return drivingUnderAge;
        } else {
            return drivingUnderAge;
        }
    }
    
    public static String exTwo(Scanner in) {
        System.out.print("Insira um numero de 1 a 10: ");
        int number = in.nextInt();
        in.nextLine();
        
        if (number % 2 == 0) {
            return "O numero é " + number + ", par.";
        } else {
            return "O numero é " + number + ", ímpar.";
        }
    }
}

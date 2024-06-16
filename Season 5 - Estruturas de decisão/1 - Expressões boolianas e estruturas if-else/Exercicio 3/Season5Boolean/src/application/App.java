package application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(exOne(in));
        System.out.println(exTwo(in));
        System.out.println(exThree());
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

    public static String exThree() {
        int myAge = 19;

        if (myAge >= 16) {
            return "I'm old enough to have a driver's license!";
        } else {
            return "I'm not old enough yet... :*(";
        }
    }
}

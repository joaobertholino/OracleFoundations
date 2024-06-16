package application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sumNumbers(in));
    }

    public static double sumNumbers(Scanner in) {
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um valor numerico: ");
            double input = in.nextDouble();
            sum += input;

            if (input == 0) {
                break;
            }
        }
        return sum;
    }

}

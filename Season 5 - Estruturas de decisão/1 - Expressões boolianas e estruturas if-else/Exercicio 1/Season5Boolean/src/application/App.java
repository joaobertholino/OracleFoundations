package application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insira sua idade: ");
        int age = in.nextInt();
        in.nextLine();
        
        boolean drivingUnderAge = false;
        
        if (age >= 18) {
            drivingUnderAge = true;
            System.out.println(drivingUnderAge);
        } else {
            System.out.println(drivingUnderAge);
        }
    }
}

package application;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = console.nextInt();

        System.out.print("Divisors of " + num + " " + "=" + " ");

//        Declação de um loop for.
        for (int i = 1; i < num; i++) {
//            Declaração de um if que verifica se o valor do resto da divição de num com i é diferente de 0.
            if (num % i != 0) {
//                Se sim, irá pular para a proxima iteração.
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}

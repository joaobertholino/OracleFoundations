package application;

import java.util.Scanner;
import model.services.FormaterName;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insira seu dois primeiros nomes: ");
        String name = in.nextLine();
        
        System.out.println("Nome formatado: " + FormaterName.formatName(name));
    }

}

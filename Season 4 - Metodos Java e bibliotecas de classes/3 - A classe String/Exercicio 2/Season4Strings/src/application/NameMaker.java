
import java.util.Scanner;


public class NameMaker {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insira seu primeiro nome: ");
        String firstName = in.nextLine();
        
        System.out.print("Insira seu nome do meio: ");
        String middleName = in.nextLine();
        
        System.out.print("Insira seu ultimo nome: ");
        String lastName = in.nextLine();
        
        String fullName = firstName + " " + middleName + " " + lastName;
<<<<<<< HEAD
        System.out.println("Operador de concatenação \"+\": " + fullName);
        
        fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        System.out.println("Método \"concat\": " + fullName);
=======
        System.out.println("Operador de concatenação \"+\" " + fullName);
        
        fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        System.out.println("Método \"concat\" " + fullName);
>>>>>>> be46e5d232b64f38fecc179b7bb0f10e96da4659
    }

}

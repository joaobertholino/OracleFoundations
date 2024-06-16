package application;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<String> students = new ArrayList<>();
    students.add("Amy");
    students.add("Bob");
    students.add("Cindy");
    students.add("David");
    
    System.out.println("Elementos do ArrayList: " + students + " - " + "Tamanho do ArrayList: " + students.size());
    
    students.add(0, "Nick");
    students.add(1, "Mick");
    students.remove(3);
    
    System.out.println("Elementos do ArrayList: " + students + " - " + "Tamanho do ArrayList: " + students.size());
  }
}

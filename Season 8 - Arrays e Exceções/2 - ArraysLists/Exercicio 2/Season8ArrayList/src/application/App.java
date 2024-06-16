package application;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(11);
    numbers.add(21);
    numbers.add(31);
    numbers.add(41);
    numbers.add(51);
    numbers.add(61);
    numbers.add(70);
    Iterator<Integer> iterator = numbers.iterator();
    
    while(iterator.hasNext()) {
      System.out.println("Elementos do ArrayList: " + iterator.next());
    }
    
    while(iterator.hasNext()) {
      if(iterator.next() % 2 == 0) {
        iterator.remove();
      }
    }
    System.out.println("Elementos do ArrayList: " + numbers);
  }
}

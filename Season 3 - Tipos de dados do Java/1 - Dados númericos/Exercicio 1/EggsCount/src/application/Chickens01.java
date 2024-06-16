package application;

public class Chickens01 {

  public static void main(String[] args) {
    System.out.println(firstScene(50, 3));
    System.out.println(firstScene(4, 8));
  }
  
  public static int firstScene(int eggsPerChickenValue, int chickenCountValue) {
    int totalEggs;
    
    totalEggs = eggsPerChickenValue * chickenCountValue;
    
    chickenCountValue++;
    totalEggs += eggsPerChickenValue * chickenCountValue;
    
    chickenCountValue /= 2;
    totalEggs += eggsPerChickenValue * chickenCountValue;
    
    return totalEggs;
  }
}

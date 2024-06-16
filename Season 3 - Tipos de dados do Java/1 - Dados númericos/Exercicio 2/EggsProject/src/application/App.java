package application;

public class App {

  public static void main(String[] args) {
    double dailyAvarage = dailyAverage(100.0, 121.0, 117.0);
    System.out.println("Daily Average: " + dailyAvarage);

    double monthlyAverage = monthlyAverage(dailyAvarage); 
    System.out.println("Monthly Avarage: " + monthlyAverage);

    double monthlyProfit = monthlyProfit(monthlyAverage);
    System.out.println("Monthly Profit: " + monthlyProfit);
  }

  public static double dailyAverage(double... amount) {
    return sum(amount) / amount.length;
  }

  public static double monthlyAverage(double dailyAvarage) {
    return dailyAvarage * 30;
  }

  public static double monthlyProfit(double monthlyAverage) {
    return monthlyAverage * 0.18;
  }

  public static double sum(double... amount) {
    double sum = 0;
    for (double i : amount) {
      sum += i;
    }
    return sum;
  }
}

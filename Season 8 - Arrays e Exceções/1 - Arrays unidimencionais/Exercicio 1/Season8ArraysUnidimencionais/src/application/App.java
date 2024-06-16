package application;

public class App {

  public static void main(String[] args) {
    int[] score = new int[9];
    byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    int[] primeNum = new int[20];
    int[] even = new int[5];
    
    long[] primes = new long[20];
    primes[0] = 2;
    primes[1] = 3;
    
    long[] primes2 = primes;
    System.out.println(primes2[0]);
    primes2[0] = 5;
    System.out.println(primes[0]);

  }
}

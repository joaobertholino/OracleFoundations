package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.entities.Coin;
import model.enums.SizeCoin;
import model.services.CoinService;

/**
 * Classe principal que contem o método main.
 *
 * @author joaob
 */
public class App {

  public static void main(String[] args) {
    List<Coin> coins = new ArrayList<>();
    coins.add(new Coin(SizeCoin.MEDIUM, 0.50));
    coins.add(new Coin(SizeCoin.SMALL, 0.10));
    coins.add(new Coin(SizeCoin.LARGE, 1.00));
    coins.add(new Coin(SizeCoin.MEDIUM, 0.25));
    coins.add(new Coin(SizeCoin.SMALL, 0.05));

    Double sumValuesMethodOne = CoinService.countCoins(coins);
    System.out.println(String.format("%.2f", sumValuesMethodOne));

    System.out.println();

    Map<Coin, SizeCoin> methodTwo = CoinService.metterCoin(coins);
    System.out.println(methodTwo.get(coins.get(1)));

    System.out.println();

    List<Coin> methodThreeSCoins = CoinService.classificationOfSize(coins, SizeCoin.SMALL);
    methodThreeSCoins.forEach(System.out::println);

    List<Coin> methodThreeMCoins = CoinService.classificationOfSize(coins, SizeCoin.MEDIUM);
    methodThreeMCoins.forEach(System.out::println);

    List<Coin> methodThreeLCoins = CoinService.classificationOfSize(coins, SizeCoin.LARGE);
    methodThreeLCoins.forEach(System.out::println);
  }
}

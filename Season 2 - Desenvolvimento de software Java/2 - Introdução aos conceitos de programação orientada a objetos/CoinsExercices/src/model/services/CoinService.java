package model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.entities.Coin;
import model.enums.SizeCoin;

/**
 * Classe de serviços que fornece método estáticos de contagem de valores,
 * medição de tamanho e classificação por tamanho de listas de objetos do tipo
 * Coin.
 *
 * @author joaob
 */
public class CoinService {

  /**
   * Método que retorna um valor do tipo Double que representa a soma dos
   * valores de cada moeda do objeto List passado como argumento.
   *
   * @param coins
   * @return
   */
  public static Double countCoins(List<Coin> coins) {
    Double sum = 0.0;
    for (Coin coin : coins) {
      sum += coin.getValue();
    }
    return sum;
  }

  /**
   * Método que retorna um objeto do tipo Map onde a chave é o proprio objeto
   * Coin do objeto do tipo List passado como argumento e o valor é o seu valor
   * do ponteiro de instancia size.
   *
   * @param coins
   * @return
   */
  public static Map<Coin, SizeCoin> metterCoin(List<Coin> coins) {
    Map<Coin, SizeCoin> result = new HashMap<>();
    for (Coin coin : coins) {
      result.put(coin, coin.getSize());
    }
    return result;
  }

  /**
   * Método responsavel por classificar cada objeto do tipo Coin do objeto de
   * tipo List passado como argumento com base no seu valor do ponteiro de
   * instancia size.
   *
   * @param coins
   * @param sizeCoin
   * @return Retorna um objeto do tipo List com os objetos que atendem o
   * criterio de classificação.
   */
  public static List<Coin> classificationOfSize(List<Coin> coins, SizeCoin sizeCoin) {
    List<Coin> result = new ArrayList<>();
    for (Coin coin : coins) {
      if (coin.getSize() == sizeCoin) {
        result.add(coin);
      }
    }
    return result;
  }
}

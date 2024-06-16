package model.entities;

import java.util.Objects;
import model.enums.SizeCoin;

/**
 * Classe que representa um objeto Coin, implementando a interface Comparable.
 *
 * @author joaob
 */
public class Coin implements Comparable<Coin> {

  /**
   * Ponteiros de instancia que apontam para valores referentes ao tamanho e ao
   * valor da moeda.
   */
  private SizeCoin size;
  private Double value;

  /**
   * Construtor padrão que não recebe parâmetros.
   */
  public Coin() {
  }

  /**
   * Construtor personalizado que recebe dois parâmetros do tipo SizeCoin e
   * Double, atribuindo os valores passados como argumento aos ponteiros de
   * instacia.
   *
   * @param size
   * @param value
   */
  public Coin(SizeCoin size, Double value) {
    this.size = size;
    this.value = value;
  }

  /**
   * Método getter que retorna o valor armazenado no ponteiro de instancia size.
   *
   * @return O valor do ponteiro de instancia size.
   */
  public SizeCoin getSize() {
    return size;
  }

  /**
   * Método setter que recebe um parâmetro do tipo SizeCoin que espera um valor
   * de tipo enumarado como argumento e atribui esse valor recebido ao ponteiro
   * de instancia size.
   *
   * @param size
   */
  public void setSize(SizeCoin size) {
    this.size = size;
  }

  /**
   * Método getter que retorna o valor armazenado no ponteiro de instancia
   * value.
   *
   * @return O valor do ponteiro de instancia value.
   */
  public Double getValue() {
    return value;
  }

  /**
   * Método setter que recebe um parâmetro do tipo Double que espera um
   * argumento e atribui esse valor recebido ao ponteiro de instancia value.
   *
   * @param value
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Método hashCode sobreescrito da superclasse Object que retorna um int que
   * representa o calculo do código hash com base no valor do ponteiro de
   * instancia size.
   *
   * @return
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 47 * hash + Objects.hashCode(this.size);
    return hash;
  }

  /**
   * Método equals sobreescrito da superclasse Object que retorna um valor
   * booleano que representa se o valor do ponteiro de instancia size deste
   * objeto é igual ou diferente do valor do ponteiro de instancia do objeto
   * passado como argumento.
   *
   * @param obj
   * @return Um valor booleano que representa se o valor do ponteiro de
   * instancia deste objeto é igual ao valor do ponteiro de instancia do objeto
   * passado como argumento.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Coin other = (Coin) obj;
    return Objects.equals(this.size, other.size);
  }

  /**
   * Método toString sobreescrito da superclasse Object que retorna os valores
   * de estado deste objeto formatados em uma string única.
   *
   * @return Retorna os valores de estado deste objeto formatados em uma string
   * única.
   */
  @Override
  public String toString() {
    return "Coin{" + "size=" + size + ", value=" + value + '}';
  }

  /**
   * Método compareTo implementado da interface Comparable que retorna um int
   * negativo, igual a zero ou positivo se este objeto for menor, igual ou maior
   * que o objeto passado como argumento.
   *
   * @param o
   * @return Retorna um int negativo, igual a zero ou positivo se este objeto
   * for menor, igual ou maior que o objeto passado como argumento.
   */
  @Override
  public int compareTo(Coin o) {
    return this.value.compareTo(o.value);
  }
}

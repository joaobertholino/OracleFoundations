package application;

import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {
    int jOptionPaneParse = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor numérico integral"));
    jOptionPaneParse++;
    
    System.out.println(jOptionPaneParse);
  }
}

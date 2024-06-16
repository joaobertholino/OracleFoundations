package application;

import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,
            "Alteração da mensagem.",
            "Alteração do titulo.",
            0);

    String input1 = (String) JOptionPane.showInputDialog(null,
            "Is this a question?",
            "Dialog Title",
            2,
            null,
            null,
            "Type something here.");
    System.out.println(input1);

    String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
    String input2 = (String) JOptionPane.showInputDialog(null,
            "Is this a question?",
            "Dialog Title",
            2,
            null,
            acceptableValues,
            acceptableValues[1]);
    System.out.println(input2);
  }

}

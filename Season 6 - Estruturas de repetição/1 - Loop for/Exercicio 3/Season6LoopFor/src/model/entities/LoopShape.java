package model.entities;

import java.util.Arrays;

public class LoopShape {

  public static void createRectangle(int width, int height) {
    char[][] rectangle = new char[height][width];
    
    for (int i = 0; i < rectangle.length; i++) {
      for (int j = 0; j < rectangle[i].length; j++) {
        if (i >= 0 || i <= rectangle.length - 1) {
          rectangle[i][j] = '#';
        } else {
          if (i > 0 && i < rectangle.length) {
            rectangle[i][j] = ' ';
          }
        }
      }
    }
  }

  public static void createTriangle(int leg) {
    //Draw an Isosceles Right Triangle

  }
}

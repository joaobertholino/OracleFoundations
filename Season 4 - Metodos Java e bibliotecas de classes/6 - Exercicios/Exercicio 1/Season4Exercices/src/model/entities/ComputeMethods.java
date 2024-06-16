package model.entities;

import java.util.Random;

public class ComputeMethods {

//    Converte a temperatura fornecida de Fahrenheit para Celsius.
    public static int exOne(int fahrenheit) {
        return 5 / 9 * (fahrenheit - 32);
    }

//    Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados
    public static double exTwo(double legOne, double legTwo) {
        double sum = Math.pow(legOne, 2) + Math.pow(legTwo, 2);
        return Math.sqrt(sum);
    }

//    Simula o giro de dois dados de seis lados e exibe a soma deles.
    public static int exThree() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            int num = random.nextInt(1, 7);
            sum += num;
        }
        return sum;
    }
}

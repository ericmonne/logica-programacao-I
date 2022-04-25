package com.company.aula06;
//Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {

        Random random = new Random();
        double numeros[] = new double[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextDouble(0, 100);
        }

    }
}

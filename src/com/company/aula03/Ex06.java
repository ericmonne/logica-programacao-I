package com.company.aula03;
//Leia 4 (quatro) números
// calcule o quadrado para cada um (n²)
// some todos e exiba o resultado

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numeros[] = new double[4];
        double quadrados[] = new double[4];
        double somaQuadrados = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Informe o %d° número: ", i+1);
            numeros[i] = Double.parseDouble(scanner.nextLine());
            quadrados[i] = Math.pow(numeros[i], 2);
            somaQuadrados +=quadrados[i];
        }

        System.out.println("Soma: " + somaQuadrados);
        scanner.close();
    }
}

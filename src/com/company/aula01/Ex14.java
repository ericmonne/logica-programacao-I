package com.company.aula01;
//Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
//Cálculo:  área = PI * (raio²)

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.2f", area);
    }
}

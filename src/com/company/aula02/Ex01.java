package com.company.aula02;
//Escreva um programa que com base em uma temperatura em graus celsius,
// realize a conversão e exiba os resultados conforme as fórmulas abaixo:
//Kelvin
//K = Celsius + 273.15;
//Fahrenheit
//F = Celsius * 1.8 + 32;
//Rankine
//Ra = Celsius * 1.8 + 32 + 459.67
//Réaumur
//Re = Celsius * 0.8;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        double rankine = fahrenheit + 459.67;
        double reamur = celsius * 0.8;

        System.out.printf("Temperatura em Kelvin: %.2f\n", kelvin);
        System.out.printf("Temperatura em Fahrenheit: %.2f\n",fahrenheit);
        System.out.printf("Temperatura em Rankine: %.2f\n", rankine);
        System.out.printf("Temperatura em Réamur: %.2f\n", reamur);

    }
}

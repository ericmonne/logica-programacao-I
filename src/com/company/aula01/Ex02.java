package com.company.aula01;

//Escreva um programa para determinar a quantidade de cavalos
// para se levantar uma massa de “m” quilogramas a uma altura de “h” em “t” segundos.
//Considere cavalos = (m * h / t ) / 745,6999

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a massa em kg: ");
        double massa = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Informe o tempo em segundos: ");
        double segundos = scanner.nextDouble();
        double cavalos = (massa * altura/ segundos)/745.6999;
        System.out.printf("São necessários %.2f cavalos para levantar %.2fkg a %.2f metros em %.2f segundos", cavalos, massa, altura, segundos);
    }
}

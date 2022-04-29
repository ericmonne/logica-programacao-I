package com.company.aula08;
//Tendo como dado de entrada a altura (h) de uma pessoa,
// construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double altura;

        System.out.print("Informe seu gênero: ");
        String genero = scanner.nextLine().toLowerCase();

        System.out.print("Informe sua altura: ");
        altura = scanner.nextDouble();

        double pesoIdealHomem = (72.7 * altura) - 58;
        double pesoIdealMulher = (62.1 * altura) - 44.7;

        if(genero.equals("masculino")){
            System.out.printf("Peso ideal: %.2fkg", pesoIdealHomem);
        }
        if(genero.equals("feminino")){
            System.out.printf("Peso ideal: %.2fkg", pesoIdealMulher);
        }

        scanner.close();
    }
}

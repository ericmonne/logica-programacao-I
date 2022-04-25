package com.company.aula02;
//Crie um programa que receba 2 números e ao final mostre as seguintes operações:
//Soma
//Subtração
//Multiplicação
//Divisão

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero01 = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double numero02 = scanner.nextDouble();

        double soma = numero01 + numero02;
        double subtracao = numero01 - numero02;
        double multiplicacao = numero01 * numero02;
        double divisao = numero01 / numero02;
        System.out.printf("Soma: %.2f + %.2f = %.2f \n", numero01, numero02, soma);
        System.out.printf("Subtração: %.2f - %.2f = %.2f\n", numero01, numero02, subtracao);
        System.out.printf("Multiplicação: %.2f * %.2f = %.2f\n", numero01, numero02, multiplicacao);
        System.out.printf("Divisão: %.2f / %.2f = %.2f\n", numero01, numero02, divisao);

        scanner.close();
    }
}

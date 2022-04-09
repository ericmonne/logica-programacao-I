package com.company.aula01;
//Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
//Dólar
//Euro
//Libra

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor em reais: R$");
        double reais = scanner.nextDouble();
        System.out.print("Informe a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Informe a cotação do euro: ");
        double cotacaoEuro = scanner.nextDouble();
        System.out.print("Informe a cotação da libra: ");
        double cotacaoLibra = scanner.nextDouble();

        double dolares = reais / cotacaoDolar;
        double euros = reais / cotacaoEuro;
        double libras = reais / cotacaoLibra;
        System.out.printf("Valor em dólares: %.2f\n", dolares);
        System.out.printf("Valor em euros: %.2f\n", euros);
        System.out.printf("Valor em libras: %.2f", libras);
    }
}

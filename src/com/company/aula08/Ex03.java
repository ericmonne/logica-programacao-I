package com.company.aula08;
//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes)
// e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite
// e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final int LIMITE_PESCA = 50;
        final int MULTA_POR_KG = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso de peixes (kg): ");
        double peso = scanner.nextDouble();

        if (peso > LIMITE_PESCA) {
            double excesso = peso - LIMITE_PESCA;
            double multaFinal = excesso * MULTA_POR_KG;
            System.out.println("KG em excesso: " + excesso);
            System.out.printf("Multa: R$%.2f", multaFinal);
        } else {
            System.out.println("Dentro do limite!");
        }
        scanner.close();
    }
}

package com.company.aula02;
//O custo ao consumidor de um carro novo
// é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
// Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%.
// Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o custo de fábrica do automóvel: R$");
        double custoFabrica = scanner.nextDouble();
        double porcentagemDistribuidor = 0.28;
        double imposto = 0.45;
        double custoFinal = custoFabrica + (custoFabrica*porcentagemDistribuidor) + (custoFabrica*imposto);
        System.out.printf("Preço final: R$%.2f", custoFinal);
    }
}

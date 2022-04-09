package com.company.aula01;
//Uma loja está vendendo seus produtos em 5 prestações sem juros.
// Faça um programa que insira o valor total de uma compra e o valor das prestações.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor total da compra: R$");
        double valorTotal = scanner.nextDouble();
        double prestacoes = valorTotal/5;
        System.out.printf("Valor da prestação: R$%.2f", prestacoes);
    }
}

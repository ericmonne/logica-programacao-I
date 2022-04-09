package com.company.aula01;
//Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
// O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o preço de custo: R$");
        double precoCusto = scanner.nextDouble();
        System.out.print("Informe o percentual de acréscimo: ");
        double percentual = scanner.nextDouble();

        double valorVenda = precoCusto + (precoCusto* percentual/100);

        System.out.printf("Valor de venda: R$%.2f", valorVenda);


    }
}

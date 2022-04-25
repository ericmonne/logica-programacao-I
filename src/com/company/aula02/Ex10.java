package com.company.aula02;
//Crie um programa que receba um valor que foi depositado
// e logo em seguida o valor com rendimento após 1 mês.
// Considere a taxa de juros da poupança em 0,70% a.m.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor a ser depositado: R$");
        double deposito = scanner.nextDouble();

        double valorComRendimento = deposito + (deposito * 0.007);

        System.out.printf("Valor com rendimento após um mês: R$%.2f", valorComRendimento);

    }
}

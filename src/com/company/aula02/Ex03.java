package com.company.aula02;
//Escreva um programa que realize o cálculo do empréstimo a juros compostos.
// Onde definimos:
// o valor da variável de quanto a pessoa quer emprestado;
//em quantos meses ela irá pagar
//A taxa de juros será de 2% ao mês
//Fórmula: M = C * (1+i)^t
//M = valor final após a aplicação dos juros
//C = valor que a pessoa vai pegar emprestado
//i é a taxa de juros
//t é o tempo
//Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do empréstimo? R$");
        double valorEmprestimo = scanner.nextDouble();
        System.out.print("Em quantos meses irá pagar? ");
        int meses = scanner.nextInt();
        double taxaJuros = 0.02;
        double valorFinal = valorEmprestimo * Math.pow((1+taxaJuros), meses);
        System.out.printf("Valor a ser pago: %.2f", valorFinal);

        scanner.close();
    }
}

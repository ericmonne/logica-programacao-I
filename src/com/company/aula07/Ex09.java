package com.company.aula07;
//Faça um programa que apresente o menu de opções a seguir:
//Menu de opções:
//	1. Média aritmética
//	2. Média ponderada
//Digite a opção desejada:
//	Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//	Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//Verifique a possibilidade de opção inválida, mostrando uma mensagem.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções:");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.print("Digite a opção desejada: ");
        int escolha = scanner.nextInt();

        double nota1;
        double nota2;
        double nota3;

        switch (escolha){
            case 1:
                System.out.print("Informe a primeira nota: ");
                nota1 = scanner.nextDouble();
                System.out.print("Informe a segunda nota: ");
                nota2 = scanner.nextDouble();
                double mediaAritmetica = (nota1 + nota2) / 2;
                System.out.printf("Média aritmética: %.2f", mediaAritmetica);
                break;
            case 2:
                System.out.print("Informe a primeira nota: ");
                nota1 = scanner.nextDouble();
                System.out.print("Informe o peso da primeira nota: ");
                double peso1 = scanner.nextDouble();
                System.out.print("Informe a segunda nota: ");
                nota2 = scanner.nextDouble();
                System.out.print("Informe o peso da segunda nota: ");
                double peso2 = scanner.nextDouble();
                System.out.print("Informe a terceira nota: ");
                nota3 = scanner.nextDouble();
                System.out.print("Informe o peso da terceira nota: ");
                double peso3 = scanner.nextDouble();
                double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
                System.out.printf("Média ponderada: %.2f", mediaPonderada);
                break;
            default:
                System.out.println("Opção Inválida");
        }

        scanner.close();
    }
}

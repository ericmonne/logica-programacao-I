package com.company.aula02;
//Escreva um programa que leia o nome de um aluno
// e as notas das 3 primeiras provas que ele obteve no semestre.
// No final deverá informar a média do aluno.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota01 = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota02 = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota03 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03) / 3;
        System.out.printf("Média semestral: %.2f ", media);
    }
}

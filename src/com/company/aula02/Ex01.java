package com.company.aula02;
//Escreva um programa que seja capaz de receber as seguintes informações
// e calcular a média da nota de um aluno:
//Nome
//Turma
//Nota 1
//Nota 2
//Nota 3

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[3];
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a turma: ");
        String turma = scanner.nextLine();
        System.out.print("Informe a primeira nota: ");
        notas[0] = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        notas[1] = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        notas[2] = scanner.nextDouble();

        double media = (notas[0] + notas[1] + notas[2])/ notas.length;

        System.out.printf("Média do aluno %s da turma %s: %.2f", nome, turma, media);
        scanner.close();
    }
}

package com.company.aula04;
//Escreva um programa que leia quatro notas escolares de um aluno
// e apresenta uma mensagem informando se o aluno foi aprovado
// caso apresente o valor da média escolar maior ou igual a 7.
// Caso contrário, apresente uma mensagem informando que ele está de recuperação.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[4];

        for(int i = 0; i<notas.length; i++){
            System.out.printf("Informe a %dª nota: ", i+1);
            notas[i]= Double.parseDouble(scanner.nextLine());
        }

        double agregador = 0;
        for(double nota : notas){
            agregador+= nota;
        }

        double media = agregador/ notas.length;
        if(media>=7){
            System.out.println("O aluno foi aprovado!");
        }else {
            System.out.println("O aluno está de recuperação =(");
        }

        scanner.close();
    }
}

package com.company.aula02;
//Crie um programa que você atribua um valor da idade de uma pessoa
// e calcule quantos dias aquela pessoa já viveu

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        int diasBissextos = idade /4;
        int diasTotais = idade * 365 + diasBissextos;

        System.out.printf("Você já viveu pelo menos %d dias", diasTotais);

        scanner.close();
    }
}

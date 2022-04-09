package com.company.aula01;

//Escreva um programa para calcular a quantidade de ferraduras necessárias
// para equipar todos os cavalos comprados para um haras.
// A informação de cavalos comprados deve ser informada pelo usuário.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de cavalos: ");
        int cavalos = scanner.nextInt();

        int ferraduras = cavalos *4;

        System.out.println("Quantidade de ferraduras a serem compradas: " + ferraduras);
    }
}

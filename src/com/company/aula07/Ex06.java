package com.company.aula07;
//Para doar sangue é necessário ter entre 18 e 67 anos.
// Faça um aplicativo que pergunte a idade de uma pessoa
// e diga se ela pode doar sangue ou não.
// Use alguns dos operadores lógicos OU (||) e E (&&).

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18 && idade <=67){
            System.out.println("Você pode doar sangue!");
        } else {
            System.out.println("Infelizmente, você não pode doar sangue.");
        }

        scanner.close();
    }
}

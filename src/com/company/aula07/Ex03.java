package com.company.aula07;
//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
// As perguntas são:
//“Telefonou para a vítima? “
//“Esteve no local do crime?”
//“Mora perto da vítima? “
//“Devia para a vítima? “
//“Já trabalhou com a vítima? “
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
// entre 3 e 4 como “Cúmplice”
// e 5 como “Assassino”.
// Caso contrário, ela será classificada como “Inocente”.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda 0 para NÃO e 1 para SIM");
        System.out.print("Telefonou para a vítima? ");
        int contador = scanner.nextInt();
        System.out.print("Esteve no local do crime? ");
        contador += scanner.nextInt();
        System.out.print("Mora perto da vítima? ");
        contador += scanner.nextInt();
        System.out.print("Devia para a vítima? ");
        contador += scanner.nextInt();
        System.out.print("Já trabalhou com a vítima? ");
        contador += scanner.nextInt();

        switch (contador){
            case 0, 1:
                System.out.println("INOCENTE");
                break;
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3, 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINA");
                break;
        }

        scanner.close();
    }
}

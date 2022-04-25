package com.company.aula04;
//Escreva um programa que recebe um número inteiro maior que zero
// e calcula o seu valor fatorial.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que zero: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        do{
            fatorial *= numero;
            numero--;
        }while(numero > 0);
        System.out.println("Fatorial: " + fatorial);

    }
}

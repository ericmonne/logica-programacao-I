package com.company.aula04;
//Faça um programa que leia um número inteiro diferente de zero
// e mostre uma mensagem indicando se este número é positivo ou negativo.
// Pare a execução do programa quando o usuário requisitar
// (O programa deve parar quando o usuário escolher 0).

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        do{
            System.out.print("Informe um número: ");
            numero = scanner.nextInt();
            if(numero>0){
                System.out.println("O número informado é positivo.");
            } else if (numero <0){
                System.out.println("O número informado é negativo.");
            }

        }while (numero != 0);

        scanner.close();
    }
}

package com.company.aula07;
//Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
//A quantidade de pessoas com mais de 90 quilos;
//A média das idades das sete pessoas;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maisPesadas = 0;
        int idades = 0;
        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i+1);
            int idade = Integer.parseInt(scanner.nextLine());
            idades += idade;
            System.out.printf("Digite o peso da %dª pessoa: ", i+1);
            double peso = Double.parseDouble(scanner.nextLine());
            if(peso > 90) {
                maisPesadas++;
            }
        }
        double mediaIdades = (double)idades/7;
        System.out.printf("Média de idade: %.2f anos\n", mediaIdades);
        System.out.printf("Há %d pessoas com mais de 90kg", maisPesadas);

        scanner.close();
    }
}

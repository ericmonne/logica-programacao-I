package com.company.aula06;
//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
// (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
//
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
// e o produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a idade do primeiro homem: ");
        int idadeHomem01 = scanner.nextInt();
        System.out.print("Informe a idade do segundo homem: ");
        int idadeHomem02 = scanner.nextInt();
        System.out.print("Informe a idade da primeira mulher: ");
        int idadeMulher01 = scanner.nextInt();
        System.out.print("Informe a idade da segunda mulher: ");
        int idadeMulher02 = scanner.nextInt();

        int maisVelho;
        int maisNovo;
        int maisVelha;
        int maisNova;

        if(idadeHomem01 > idadeHomem02){
            maisVelho = idadeHomem01;
            maisNovo = idadeHomem02;
        }else {
            maisVelho = idadeHomem02;
            maisNovo = idadeHomem01;
        }

        if (idadeMulher01 > idadeMulher02) {
            maisVelha = idadeMulher01;
            maisNova = idadeMulher02;
        } else {
            maisVelha = idadeMulher02;
            maisNova = idadeMulher01;
        }

        int somaIdades = maisVelho + maisNova;
        int produtoIdades = maisNovo * maisVelha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

        scanner.close();
    }
}

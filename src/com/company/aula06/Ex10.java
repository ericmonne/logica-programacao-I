package com.company.aula06;
//Faça a leitura de um valor inteiro.
// Em seguida, calcule o menor número de notas possíveis (cédulas)
// onde o valor pode ser decomposto.
// As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
//Na sequência mostra o valor lido e a relação de notas necessárias

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();

        int resto = valor;
        int quantidadeNotas = 0;
        int novoValor = 0;

        if (valor >= 100) {
            int divisao = valor / 100;
            resto = valor % 100;
            quantidadeNotas = divisao;
            novoValor = resto;
        }
        if (novoValor >= 50) {
            int divisao = novoValor / 50;
            resto = novoValor % 50;
            quantidadeNotas += divisao;
            novoValor = resto;
        }
        if (novoValor >= 20) {
            int divisao = novoValor / 20;
            resto = novoValor % 20;
            quantidadeNotas += divisao;
            novoValor = resto;
        }
        if (novoValor >= 10) {
            int divisao = novoValor / 10;
            resto = novoValor % 10;
            quantidadeNotas += divisao;
            novoValor = resto;
        }
        if (novoValor >= 5) {
            int divisao = novoValor / 5;
            resto = novoValor % 5;
            quantidadeNotas += divisao;
            novoValor = resto;
        }
        if (novoValor >= 2) {
            int divisao = novoValor / 2;
            resto = novoValor % 2;
            quantidadeNotas += divisao;
            novoValor = resto;
        }
        if (novoValor >= 1) {
            quantidadeNotas += novoValor;
        }

        System.out.println("Valor: R$" + valor);
        System.out.println("Quantidade mínima de notas necessárias: " + quantidadeNotas);

        scanner.close();
    }
}

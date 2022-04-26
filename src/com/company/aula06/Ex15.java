package com.company.aula06;
// Uma loja está levantando o valor total de todas as mercadorias em estoque.
// Escreva um algoritmo que permita a entrada das seguintes informações:
//a quantidade de produtos que irá cadastrar
//para cada produto:
//o nome do produto
//o número total de mercadorias no estoque;
//o valor unitário da mercadoria.
//Imprimir o valor total em estoque e a média de valor das mercadorias.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos a ser cadastrada: ");
        int quantidadeProdutos = Integer.parseInt(scanner.nextLine());
        String nomeProdutos[] = new String[quantidadeProdutos];
        int quantidadeMercadoria[] = new int[quantidadeProdutos];
        double valoresMercadorias[] = new double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.printf("Informe o nome do %dº produto: ", i+1);
            nomeProdutos[i] = scanner.nextLine();
            System.out.printf("Total de %s em estoque: ", nomeProdutos[i]);
            quantidadeMercadoria[i] = Integer.parseInt(scanner.nextLine());
            System.out.printf("Valor unitário de %s: ", nomeProdutos[i]);
            valoresMercadorias[i] = Double.parseDouble(scanner.nextLine());
        }

        double valorTotal = 0;
        double valorPorMercadoria = 0;
        int contador = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            valorTotal += quantidadeMercadoria[i] * valoresMercadorias[i];
            valorPorMercadoria += valoresMercadorias[i];
            contador ++;
        }

        double media = valorPorMercadoria / contador;
        System.out.printf("Valor total em estoque: R$%.2f\n", valorTotal);
        System.out.printf("Valor médio das mercadorias: R$%.2f", media);
        scanner.close();
    }
}

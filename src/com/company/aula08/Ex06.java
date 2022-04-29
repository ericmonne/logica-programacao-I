package com.company.aula08;
//Faça um Programa para uma loja de tintas.
// O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
// e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas
// e os respectivos preços em 2 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (m²): ");
        double area = scanner.nextDouble();

        final int COBERTURA_LITRO_TINTA = 6;
        final int LATA = 18;
        final int COBERTURA_LATA = LATA * COBERTURA_LITRO_TINTA;
        final int PRECO_LATA = 80;
        final double GALAO = 3.6;
        final double COBERTURA_GALAO = GALAO * COBERTURA_LITRO_TINTA;
        final int PRECO_GALAO = 25;


        double latas = area / COBERTURA_LATA;
        int quantidadeLatas = (int) latas;
        if(latas < 1 || latas % 1 != 0){
            quantidadeLatas++;
        }
        double precoTotalLata = quantidadeLatas * PRECO_LATA;

        double galoes = area / COBERTURA_GALAO;
        int quantidadeGaloes = (int) (galoes);
        if(galoes<1 || galoes %1 !=0){
            quantidadeGaloes++;
        }
        double precoTotalGalao = quantidadeGaloes * PRECO_GALAO;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + quantidadeLatas);
        System.out.printf("Preço total: R$%.2f\n", precoTotalLata);
        System.out.println("Quantidade de galões de tinta a serem comprados: " + quantidadeGaloes);
        System.out.printf("Preço total: R$%.2f\n", precoTotalGalao);

        scanner.close();
    }
}

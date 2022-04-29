package com.company.aula08;
//Faça um programa para uma loja de tintas.
// O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
// e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.


import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (m²): ");
        double area = scanner.nextDouble();

        final int COBERTURA_LITRO_TINTA = 3;
        final int LATA = 18;
        final int COBERTURA_LATA = LATA * COBERTURA_LITRO_TINTA;
        final int PRECO_TINTA = 80;

        double latas = area / COBERTURA_LATA;
        int quantidadeLatas = (int) latas;
        if(latas < 1 || latas % 1 != 0){
            quantidadeLatas++;
        }
        double precoTotal = quantidadeLatas * PRECO_TINTA;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + quantidadeLatas);
        System.out.printf("Preço total: R$%.2f", precoTotal);

        scanner.close();
    }
}

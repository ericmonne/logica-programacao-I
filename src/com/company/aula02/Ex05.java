package com.company.aula02;
// Escreva um programa para calcular a quantidade de litros de combustível
// necessária para se fazer uma viagem,
// sabendo-se que o carro faz 12 Km com um litro.
// Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
//
//utilizar as seguintes fórmulas:
// 	distância = tempo x velocidade
//litros usados = distância / 12

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem: ");
        double tempo = scanner.nextDouble();
        System.out.print("Informe a velocidade média da viagem: ");
        double velocidade = scanner.nextDouble();
        double distancia = tempo * velocidade;
        double litrosUsados = distancia/12;
        System.out.printf("São necessários %.2f litros de combustível", litrosUsados);
        scanner.close();
    }
}

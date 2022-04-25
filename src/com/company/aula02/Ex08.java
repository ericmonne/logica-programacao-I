package com.company.aula02;
//Escreva um programa em java para definir o consumo médio de um automóvel
// sendo fornecido a distância total percorrida pelo automóvel
// e o total de combustível gasto (litros).

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distância total percorrida: ");
        double distancia = scanner.nextDouble();
        System.out.print("Informe o total de combustível gasto (litros): ");
        double litros = scanner.nextDouble();
        double consumoMedio = litros / distancia;
        System.out.printf("O consumo médio é de %.2f litros por quilômetro.", consumoMedio);
    }
}

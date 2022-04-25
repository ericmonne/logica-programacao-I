package com.company.aula06;
//Crie um método que recebe uma matriz bidimensional inteira
// e um inteiro que indica uma de suas linhas,
// e retorna a média dos valores daquela linha

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas terá a sua matriz? ");
        int linhas = Integer.parseInt(scanner.nextLine());
        System.out.print("Quantas colunas terá a sua matriz? ");
        int colunas = Integer.parseInt(scanner.nextLine());

        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe um número para a %dª linha: ", i+1);
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int agregador = 0;
        int contador = 0;

        System.out.print("Informe uma linha para receber sua média: ");
        int linha = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                agregador += matriz[linha-1][j];
                contador ++;
            }
        }

        double media = agregador/contador;

        System.out.printf("A média dos numeros na linha %d é: %.2f", linha, media);

        scanner.close();
    }
}

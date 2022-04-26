package com.company.aula07;
//Calcular a quantidade de dinheiro gasta por um fumante.
//Dados:
// o número de anos que ele fuma,
// o nº de cigarros fumados por dia
// e o preço de uma carteira com 20 cigarros.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há quantos anos você fuma? ");
        int anos = scanner.nextInt();

        System.out.print("Quantos cigarros você fuma por dia?");
        int cigarrosDiarios = scanner.nextInt();

        System.out.print("Qual o preço do maço que você compra? ");
        double precoMaco = scanner.nextDouble();

        double precoCigarro = precoMaco / 20;

        double dinheiroGasto = anos * 365 * precoCigarro * cigarrosDiarios;

        System.out.printf("Até agora, você gastou R$%.2f em cigarros", dinheiroGasto);

        scanner.close();
    }
}

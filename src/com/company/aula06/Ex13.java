package com.company.aula06;
//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//
//Álcool
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//
//Gasolina
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro
//
//	Escreva um algoritmo que leia o número de litros vendidos
//	e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
//	calcule e imprima o valor a ser pago pelo cliente
//	sabendo-se que o preço do litro da gasolina é R$ 7,59
//	e o preço do litro do álcool é R$ 5,20.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Litros vendidos: ");
        double litros = Double.parseDouble(scanner.nextLine());
        System.out.print("Tipo de Combustível (A-álcool, G-gasolina): ");
        String combustivel = scanner.nextLine().toLowerCase();

        final double PRECO_GASOLINA = 7.59;
        final double PRECO_ALCOOL = 5.20;

        double precoFinal = 0;
        double desconto;

        if(combustivel.equals("a")){
            if (litros < 20){
                desconto = (PRECO_ALCOOL * litros)*3/100;
                precoFinal = (PRECO_ALCOOL * litros) - desconto;
            } else {
                desconto = (PRECO_ALCOOL * litros)*5/100;
                precoFinal = (PRECO_ALCOOL * litros) - desconto;
            }
        } else if(combustivel.equals("g")){
            if (litros < 20){
                desconto = (PRECO_GASOLINA * litros)*4/100;
                precoFinal = (PRECO_GASOLINA * litros) - desconto;
            } else {
                desconto = (PRECO_GASOLINA * litros) *6/100;
                precoFinal = (PRECO_GASOLINA * litros) - desconto;
            }
        }

        System.out.printf("Valor a ser pago: R$%.2f", precoFinal);

        scanner.close();
    }
}

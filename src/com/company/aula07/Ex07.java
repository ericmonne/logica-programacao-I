package com.company.aula07;
//Uma loja utiliza o código V para transação à vista e P para transação a prazo.
// Faça um programa que receba código e valor de 15 transações usando laços de repetição.
// Calcule e mostre:
//O valor total das compras à vista
//O valor total das compras a prazo.
//O valor total das compras efetuadas
//O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double compras[] = new double[15];
        double comprasVista[] = new double[15];
        double comprasPrazo[] = new double[15];

        for (int i = 0; i < compras.length; i++) {
            System.out.print("Digite V para transação à vista e P para transação a prazo: ");
            String codigo = scanner.nextLine();
            System.out.printf("Digite o valor da %dª transação: R$", i+1);
            compras[i] = Double.parseDouble(scanner.nextLine());
            if(codigo.equals("V")){
                comprasVista[i] = compras[i];
            } else if(codigo.equals("P")){
                comprasPrazo[i] = compras[i];
            }
        }

        double totalCompras = 0;
        double totalComprasPrazo = 0;
        double totalComprasVista = 0;
        for (int i = 0; i < compras.length; i++) {
            totalCompras += compras[i];
            totalComprasPrazo += comprasPrazo[i];
            totalComprasVista += comprasVista[i];
        }


        System.out.printf("Valor total das compras: RS%.2f\n", totalCompras);
        System.out.printf("Valor total das compras à vista: RS%.2f\n", totalComprasVista);
        System.out.printf("Valor total das compras a prazo: RS%.2f\n", totalComprasPrazo);

        for (int i = 0; i < comprasPrazo.length; i++) {
            if(comprasPrazo[i] !=0) {
                double primeiraPrestacao = comprasPrazo[i] /3;
                System.out.printf("Valor da primeira prestação da compra a prazo: R$%.2f\n", primeiraPrestacao);
            }
        }


        scanner.close();
    }
}

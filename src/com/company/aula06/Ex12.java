package com.company.aula06;
// Ler o salário fixo
// e o valor das vendas efetuadas pelo vendedor de uma empresa.
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00
// mais 5% sobre o que ultrapassar este valor,
// calcular e escrever o seu salário total.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: R$");
        double salario = scanner.nextDouble();
        System.out.print("Informe o valor das vendas: R$");
        double vendas = scanner.nextDouble();

        if (vendas <= 1500){
            salario += vendas*3/100;
        }
        else {
            double resto = vendas - 1500;
            salario += 45 + resto *5/100;
        }


        System.out.printf("Salário total: R$%.2f", salario);

        scanner.close();
    }
}

package com.company.aula02;
//Crie um programa que com base em um salário de um funcionário,
// reajusta o salário em 7% e mostra o valor antes do reajuste e após.


import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: ");
        double salarioInicial = scanner.nextDouble();
        double salarioReajustado = salarioInicial+(salarioInicial*0.07);
        System.out.printf("Salário antes do reajuste: R$%.2f\n", salarioInicial);
        System.out.printf("Salário depóis do reajuste: R$%.2f", salarioReajustado);
    }
}

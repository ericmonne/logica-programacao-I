package com.company.aula07;
//Faça um programa para o cálculo de uma folha de pagamento,
// sabendo que os descontos são do imposto de Renda,
// que depende do salário bruto (conforme tabela abaixo)
// e 3% para o Sindicato
// e que o FGTS corresponde a 11% do salário bruto,
// mas não é descontado (é a empresa que deposita.)
//O salário líquido corresponde ao salário bruto menos os descontos
// O programa deverá pedir ao usuário o valor da sua hora
// e a quantidade de horas trabalhadas no mês.
//
//a. Desconto do IR;
//b. Salário Bruto até R$900,00 (inclusive) – Isento;
//c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//e. Salário bruto acima de 2500 – Desconto de 20%.


import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da sua hora de trabalho: R$");
        double valorHora = scanner.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = horasTrabalhadas * valorHora;
        double impostoRenda;

        if(salarioBruto <= 900){
            impostoRenda = 0;
        } else if(salarioBruto <= 1500){
            impostoRenda = salarioBruto * 0.05;
        } else if(salarioBruto <= 2500) {
            impostoRenda = salarioBruto * 0.1;
        } else {
            impostoRenda = salarioBruto * 0.2;
        }

        double taxaSindicato = salarioBruto * 0.03;

        double salarioLiquido = salarioBruto - impostoRenda - taxaSindicato;

        double fgts = salarioBruto * 0.11;

        double totalPago = salarioBruto + fgts;

        System.out.println("---FOLHA DE PAGAMENTO---");
        System.out.printf("Salário Bruto: R$%.2f\n", salarioBruto);
        System.out.printf("Imposto de Renda: R$%.2f\n", impostoRenda);
        System.out.printf("Taxa Sindical: R$%.2f\n", taxaSindicato);
        System.out.printf("FGTS: R$%.2f\n", fgts);
        System.out.printf("Total Pago: R$%.2f\n", totalPago);
        System.out.printf("Salário Líquido: R$%.2f\n", salarioLiquido);

        scanner.close();
    }
}

package com.company.aula04;
//Escreva um programa que receba o peso e a altura de uma pessoa
// e calcule o seu IMC,
// o resultado irá dizer se a pessoa está:
// abaixo do peso (IMC inferior a 18,5),
// com peso normal (IMC entre 18,5 a 24,9),
// com excesso de peso (IMC entre 25,0 a 29,9)
// ou obesa (30 ou mais de IMC),
// informe cada um deles com uma mensagem.
//
//Use a fórmula: IMC = Peso / (Altura × Altura)

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5){
            System.out.printf("Abaixo do peso - IMC = %.2f", IMC);
        } else if(IMC < 25){
            System.out.printf("Peso normal - IMC = %.2f", IMC);
        } else if (IMC < 30){
            System.out.printf("Acima do peso - IMC = %.2f", IMC);
        } else {
            System.out.printf("Obesidade - IMC = %.2f", IMC);
        }

    }
}

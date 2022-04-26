package com.company.aula07;
//Leia a velocidade máxima permitida em uma avenida
// e a velocidade com que o motorista estava dirigindo nela
// e calcule a multa que uma pessoa vai receber, sabendo que são pagos:
//	a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
//  	(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
//	 b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
//	c) 200 reais, se estiver acima de 31km/h da velocidade permitida.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a velocidade máxima permitida: ");
        int velocidadeMaxima = scanner.nextInt();
        System.out.print("Informe a velocidade do carro: ");
        int velocidadeCarro = scanner.nextInt();

        double valorMulta = 0;
        if(velocidadeCarro > velocidadeMaxima){
            if(velocidadeCarro <= velocidadeMaxima + 10){
                valorMulta = 50;
            } else if(velocidadeCarro <= velocidadeMaxima + 30){
                valorMulta = 100;
            } else{
                valorMulta = 200;
            }
        }
        System.out.printf("Valor da multa: R$%.2f", valorMulta);
        scanner.close();
    }
}

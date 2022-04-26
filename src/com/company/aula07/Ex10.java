package com.company.aula07;
//Cada espectador de um cinema respondeu a um questionário no qual constava sua idade
// e a sua opinião em relação ao filme:
//
//3 - ótimo,
//2 - bom,
//1 - regular
//
// Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
//
//A média das idades das pessoas que responderam ótimo;
//A quantidade de pessoas que respondeu regular;
//A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int espectadores = 5;
        int idades[] = new int[espectadores];
        int opinioes[] = new int[espectadores];
        int regular = 0;
        int bom = 0;
        int otimo = 0;
        int idadesOtimo = 0;


        for (int i = 0; i < espectadores; i++) {
            System.out.printf("Idade do %dº espectador: ", i+1);
            idades[i] = Integer.parseInt(scanner.nextLine());
            System.out.printf("Opinião do %dº espectador (3 - ótimo / 2 - bom / 1 - regular): ", i+1);
            opinioes[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < espectadores; i++) {
            if(opinioes[i] ==3){
                otimo++;
                idadesOtimo += idades[i];
            } else if(opinioes[i] ==2){
                bom ++;
            } else if(opinioes[i]==1){
                regular++;
            }
        }

        double percentagemBom = (double) bom / espectadores *100;
        double mediaIdades = (double) idadesOtimo / otimo;
        System.out.printf("Média das idades das pessoas que responderam ótimo: %.2f\n", mediaIdades);
        System.out.printf("Quantidade de pessoas que respondeu regular: %d\n", regular);
        System.out.printf("Percentagem de pessoas que responderam 'bom': %.2f%%\n", percentagemBom);


        scanner.close();
    }
}

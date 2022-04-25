package com.company.aula06;
//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
// Faça um algoritmo para coletar dados sobre o salário
// e número de filhos de cada habitante e após as leituras, escrever:
//Média de salário da população
//Média do número de filhos
//Maior salário dos habitantes
//Percentual de pessoas com salário menor que R$ 150,00
//Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = 1;
//        double salario[] = new double[tamanhoMatriz];
//        int filhos[] = new int[tamanhoMatriz];
//
//
//        for (int i = 0; i < salario.length; i++) {
//            System.out.print("Informe o salário: R$");
//            salario[i] = Double.parseDouble(scanner.nextLine());
//            if(salario[i] < 0){
//                break;
//            } else {
//                tamanhoMatriz++;
//            }
//            System.out.print("Quantidade de filhos");
//            filhos[i] = Integer.parseInt(scanner.nextLine());
//        }
        double salario;
        int filhos;
        double totalSalarios = 0;
        double contadorGenerico = 0;
        double contadorSalariosBaixos = 0;
        int totalFilhos = 0;
        double maiorSalario = 0;
        do {
            System.out.print("Informe o salário: R$");
            salario = Double.parseDouble(scanner.nextLine());
            if (salario < 0) {
                break;
            }
            System.out.print("Quantidade de filhos: ");
            filhos = Integer.parseInt(scanner.nextLine());
            contadorGenerico++;
            totalSalarios += salario;
            totalFilhos += filhos;
            if(maiorSalario < salario){
                maiorSalario = salario;
            }
            if(salario < 150){
                contadorSalariosBaixos++;
            }
        }while (salario>0);

        double mediaSalarios = totalSalarios/contadorGenerico;
        double percentualSalariosBaixos = contadorSalariosBaixos/contadorGenerico *100;
        double mediaFilhos = totalFilhos/contadorGenerico;

        System.out.printf("Média de filhos : %.2f\n", mediaFilhos);
        System.out.printf("Média de salários: R$%.2f\n", mediaSalarios);
        System.out.printf("Percentual de salários abaixo de R$150,00: %.2f%%\n", percentualSalariosBaixos);
        System.out.printf("Maior salário: R$%.2f", maiorSalario);


    }
}

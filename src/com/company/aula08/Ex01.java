package com.company.aula08;
//Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
// No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
// O seu resultado fica sendo a média dos três valores restantes.
// Você deve fazer um programa que receba o nome
// e as cinco distâncias alcançadas pelo atleta em seus saltos
// e depois informe a média dos saltos conforme a descrição acima informada
// (retirar o melhor e o pior salto e depois calcular a média).
// Faça uso de uma lista para armazenar os saltos.
// Os saltos são informados na ordem da execução, portanto não são ordenados.
//
//O programa deve ser encerrado quando não for informado o nome do atleta.
// A saída do programa deve ser conforme o exemplo abaixo:
//
//Atleta: João da Silva
//
//Primeiro Salto: 6.5 m
//Segundo Salto: 6.1 m
//Terceiro Salto: 6.2 m
//Quarto Salto: 5.4 m
//Quinto Salto: 5.3 m
//
//Melhor salto: 6.5 m
//Pior salto: 5.3 m
//
//Média dos demais saltos: 5.9 m
//
//
//Resultado final:
//Rodrigo Curvêllo: 5.9 m

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<String>();
        int quantidadeSaltos = 5;
        List<Double> mediaSaltos = new ArrayList<Double>();

        while(true){
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if(nome.equals("")){
                break;
            }
            nomes.add(nome);

            List<Double> distanciaSaltos = new ArrayList<Double>();
            for (int i = 0; i < quantidadeSaltos; i++) {
                System.out.printf("Distância do %dº salto: ", i+1);
                double salto = Double.parseDouble(scanner.nextLine());
                distanciaSaltos.add(salto);

            }

            double piorSalto = 1000 ;
            double melhorSalto = 0;
            double agregador = 0;
            for (double salto : distanciaSaltos) {
                if(salto < piorSalto){
                    piorSalto = salto;
                } else if(salto > melhorSalto){
                    melhorSalto = salto;
                }
                agregador += salto;
            }

                System.out.printf("\nAtleta: %s\n\n", nome);
                System.out.printf("Primeiro salto: %.2fm\n", distanciaSaltos.get(0));
                System.out.printf("Segundo salto: %.2fm\n", distanciaSaltos.get(1));
                System.out.printf("Terceiro salto: %.2fm\n", distanciaSaltos.get(2));
                System.out.printf("Quarto salto: %.2fm\n", distanciaSaltos.get(3));
                System.out.printf("Quinto salto: %.2fm\n", distanciaSaltos.get(4));
                distanciaSaltos.remove(piorSalto);
                distanciaSaltos.remove(melhorSalto);
                double mediaSalto = (agregador - piorSalto - melhorSalto)/3;
                System.out.printf("Melhor salto: %.2fm\n", melhorSalto);
                System.out.printf("Pior salto: %.2fm\n", piorSalto);
                System.out.printf("Média dos demais saltos: %.2fm\n\n", mediaSalto);
                mediaSaltos.add(mediaSalto);

        }

        double maiorMedia = 0;
        int indexMaiorMedia = 0;
        for (double media: mediaSaltos) {
            if(media > maiorMedia){
                maiorMedia = media;
                indexMaiorMedia = mediaSaltos.indexOf(maiorMedia);
            }
        }
        System.out.println("----Resultado Final----");
        System.out.printf("%s: %.2fm", nomes.get(indexMaiorMedia), maiorMedia);
        scanner.close();
    }
}

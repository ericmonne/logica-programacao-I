package com.company.aula08;
//Faça um programa que carregue uma lista com os modelos de cinco carros
// (exemplo de modelos: FUSCA, GOL, VECTRA etc).
// Carregue uma outra lista com o consumo desses carros,
// isto é, quantos quilômetros cada um desses carros faz com um litro de combustível.
// Calcule e mostre:
//O modelo do carro mais econômico;
//Quantos litros de combustível cada um dos carros cadastrados consome
// para percorrer uma distância de 1000 quilômetros
// e quanto isto custará,
// considerando um que a gasolina custe R$ 7,25 o litro.
//Abaixo segue uma tela de exemplo.
// A disposição das informações deve ser o mais próxima possível ao exemplo.
// Os dados são fictícios e podem mudar a cada execução do programa.
// Comparativo de Consumo de Combustivel
// Vel
//Nome: fusca
//Km por litro: 7
//Veiculo 2
//Nome: gol
//Km por litro: 10
//Veiculo 3
//Nome: uno
//Km por litro: 12.5
//Veiculo 4
//Nome: Vectra
//Km por litro: 9
//Veiculo 5
//Nome: Peugeout
//Km por litro: 14.5
//Relatório Final
//1
//fusca
//2 - gol
//3
//uno
//4
//vectra
//5 peugeout
//14.5
//O menor consumo é do peugeout.
//7.0
//10.0
//12.5
//-
//-
//9.0 -
//142.9 litros - R$ 321.43
//100.0 litros - R$ 225.00
//80.0 litros. R$ 180.00
//R$ 250.00
//-
//111.1 litros
//69.0 litros
//R$ 155.17
// ver p.3 https://docs.google.com/document/d/1uXKq8SXXZoGRUjr5tZZ8G3nTnAQNSO4w3gsEHrIj_RQ/edit

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {

        Random random = new Random();

        double[] vetorConsumos = {6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14, 14.5, 15};

        int indexVetor;
        int quantidadeCarros = 5;
        List<String> modelosCarros = Arrays.asList("Brasília", "Palio", "Voyage", "Escort", "Siena");
        List<Double> consumoCarros = new ArrayList<Double>(quantidadeCarros);
        final double PRECO_GASOLINA = 7.25;
        List<Double> litrosParaMilKm = new ArrayList<Double>(quantidadeCarros);
        List<Double> custoParaMilKm = new ArrayList<Double>(quantidadeCarros);

        for (int i = 0; i < quantidadeCarros; i++) {
            indexVetor = (int) (Math.random() * vetorConsumos.length);
            consumoCarros.add(vetorConsumos[indexVetor]);
            litrosParaMilKm.add(1000 / vetorConsumos[indexVetor]);
            custoParaMilKm.add(litrosParaMilKm.get(i) * 7.25);
        }

        double consumoDoMaisEconomico = 0;
        int indexMaisEconomico = 0;
        for (double consumo : consumoCarros) {
            if(consumo > consumoDoMaisEconomico ){
                consumoDoMaisEconomico = consumo;
            }
        }
        indexMaisEconomico = consumoCarros.indexOf(consumoDoMaisEconomico);
        String modeloMaisEconomico = modelosCarros.get(indexMaisEconomico);

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.printf("Veículo %d\n", i+1);
            System.out.printf("Nome: %s\n", modelosCarros.get(i));
            System.out.printf("Km por litro: %.1f\n", consumoCarros.get(i));
        }

        System.out.println("\nRELATÓRIO FINAL");
        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.printf(" %d - %s \t\t - %.1f - %.2f litros - R$%.2f\n", i+1, modelosCarros.get(i), consumoCarros.get(i), litrosParaMilKm.get(i), custoParaMilKm.get(i));
        }

        System.out.printf("O menor consumo é do %s.", modeloMaisEconomico);
    }
}

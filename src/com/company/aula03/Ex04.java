package com.company.aula03;
//Um hotel quer fazer um levantamento das praias da cidade para uma
//programação turística. Sabendo-se que cada praia tem um nome e uma
//distância (em Km) do hotel, escreva um programa que forneça os
//seguintes dados:
//
//- O nome da praia mais distante.
//- Quantas praias estão a mais de 10km e a menos de 15km.
//- A distância média das praias.
//
//// Para cada praia deverá ser informado seu nome e a distância em Km
//do hotel.
//
//Você deve receber 5 praias;
//Você deve armazenar o nome das 5 praias em um array;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String praias[] = new String[5];
        double distancias[] = new double[5];
        String praiaMaisLonge = "";
        double praiasIntermediarias = 0;
        double distanciaMedia;
        double maisDistante = 0;

        for(int i = 0; i < praias.length; i++){
            System.out.print("Informe o nome da praia: ");
            praias[i] = scanner.nextLine();
            System.out.print("Informe a distância da praia em relação ao hotel: ");
            distancias[i] = Double.parseDouble(scanner.nextLine());
        }
        double agregaDistancias = 0;
        for(double distancia: distancias){
            agregaDistancias += distancia;
        }
        distanciaMedia = agregaDistancias/distancias.length;

        for(int i = 0; i < praias.length; i++){
            if(distancias[i]>maisDistante) {
                maisDistante = distancias[i];
                praiaMaisLonge = praias[i];
            }
        }
        for(double distancia : distancias){
            if(distancia>10 && distancia<15){
                praiasIntermediarias++;
            }
        }
        System.out.println("Praia mais distante: " + praiaMaisLonge);
        System.out.println(praiasIntermediarias + " praias estão a mais de 10km e a menos de 15km");
        System.out.printf("Distância média das praias: %.2f", distanciaMedia);

        scanner.close();
    }
}

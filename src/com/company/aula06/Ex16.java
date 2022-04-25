package com.company.aula06;
//Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas
// e armazenar os nomes lidos em um vetor.
// Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa
// e depois escrever a mensagem ACHEI,
// se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor),
// ou NÃO ACHEI caso contrário

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%dº nome: ", i+1);
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Procure um nome: ");
        String nomeBuscado = scanner.nextLine();
        boolean buscaNome = false;

        for (String nome: nomes
             ) {
            if(nomeBuscado.equals(nome)){
                buscaNome = true;
                break;
            }
        }
        if(buscaNome){
            System.out.println("ACHEI!");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}

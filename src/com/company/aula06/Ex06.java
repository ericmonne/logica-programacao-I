package com.company.aula06;
// Escreva um programa que leia um vetor de 13 elementos inteiros,
// que é o Gabarito de um teste da loteria esportiva,
// contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3).
// Leia, a seguir, para cada apostador, o número do seu cartão
// e um vetor de Respostas de 13 posições.
// Verifique para cada apostador o números de acertos,
// comparando o vetor de Gabarito com o vetor de Respostas.
// Escreva o número do apostador e o número de acertos.
// Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int gabarito[] = new int[13];

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = random.nextInt(1, 4);
            System.out.println(gabarito[i]);
        }

        int apostadores = 3;
        int numeroCartao[] = new int[apostadores];
        int respostas[][] = new int[apostadores][gabarito.length];

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Informe o número do seu cartão: ");
            numeroCartao[i] = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < respostas[i].length ; j++) {
                //System.out.printf("Informe a %dª resposta: ", j+1);
                //respostas[i][j] = Integer.parseInt(scanner.nextLine());
                respostas[i][j] = random.nextInt(1,4);
            }
        }

        int contador = 0;
        for (int i = 0; i < respostas.length; i++) {
            for (int j = 0; j < respostas[i].length ; j++) {
                if (respostas[i][j] == gabarito[j]){
                    contador++;
                }
            }
            if(contador == 13){
                System.out.printf("Parabéns, apostador %d, você é o vencedor!\n", numeroCartao[i]);
            } else {
                System.out.printf("Apostador %d, você acertou %d palpites\n", numeroCartao[i], contador);
            }
            contador = 0;
        }

        scanner.close();
    }
}

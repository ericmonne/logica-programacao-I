package com.company.aula04;
//Escreva um programa que gera um número inteiro aleatório entre 1 e 10
// e peça que o usuário informe o número correto,
// você deve dar dicas caso o palpite esteja errado,
// informando se o número correto é maior ou menor do que o informado,
// caso ele erre três vezes o programa se encerra
// e imprime uma mensagem informando que ele perdeu.

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        int aleatorio = random.nextInt(1, 10);

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        do{
            System.out.print("Informe um número e tente a sorte: ");
            int palpite = scanner.nextInt();
            if (palpite > aleatorio){
                System.out.println("Seu palpite é maior que o número correto");
                contador++;
            } else if (palpite < aleatorio){
                System.out.println("Seu palpite é menor que o número correto");
                contador++;
            } else {
                System.out.println("Parabéns, você acertou!");
                break;
            }
        }while (contador < 3);

        if (contador ==  3) System.out.println("Que pena, você perdeu");
    }
}

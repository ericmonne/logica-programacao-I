package com.company.aula06;
//Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova.
// A seguir, para cada um dos 10 alunos da turma,
// leia o vetor de respostas (R) do aluno
// e conte o número de acertos.
// Mostre o número de acertos do aluno e uma mensagem APROVADO,
// se a nota for maior ou igual a 6;
// e mostre uma mensagem de REPROVADO, caso contrário.


import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char gabarito[] = new char[10];

        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Resposta da questão %dª: ", i+1);
            gabarito[i] = scanner.next().charAt(0);
        }

        char respostas[] = new char[10];
        int acertos = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < respostas.length; j++) {
                System.out.printf("Resposta do aluno, questão %d: ", j+1);
                respostas[j] = scanner.next().charAt(0);
                if(respostas[j] == gabarito[j]){
                    acertos++;
                }
            }
            if(acertos >= 6){
                System.out.println("APROVADO!");
            } else {
                System.out.println("REPROVADO!");
            }
            acertos = 0;
        }

        scanner.close();
    }
}

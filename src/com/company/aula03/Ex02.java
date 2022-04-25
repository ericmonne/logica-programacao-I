package com.company.aula03;
//Elabore um programa que escreve seu nome completo na primeira linha,
// seu endereço na segunda,
// e o CEP e telefone na terceira.

public class Ex02 {
    public static void main(String[] args) {

        String nome = "Eric Monné Fraga de Oliveira";
        String endereco = "Rua da Felicidade, 13";
        String cep = "20202-222";
        String telefone = "+55 (21) 999-999-999";
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CEP: " + cep + " | Telefone: " + telefone);
    }
}

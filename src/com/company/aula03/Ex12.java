package com.company.aula03;
//Escreva um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150
//Salário: maior que 0
//Sexo: ‘f’ ou ‘m’
//Estado civil: ‘s’, ‘c’, ‘v’, ‘d

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Informe o salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Informe o sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Informe o estado civil: ");
        String estadoCivil = scanner.nextLine();

        if(nome.length() > 3){
            System.out.println("Nome válido: maior que 3 caracteres");
        } else {
            System.out.println("Nome inválido: menor que 4 caracteres");
        }

        if(idade > 0 && idade < 150){
            System.out.println("Idade válida: entre 0 e 150");
        } else{
            System.out.println("Idade inválida: não está entre 0 e 150");
        }

        if(salario > 0){
            System.out.println("Salário válido: maior que zero");
        } else{
            System.out.println("Salário inválido: menor que zero");
        }

        if(sexo.equals("m") || sexo.equals("f")){
            System.out.println("Sexo válido: 'm' ou 'f'");
        } else {
            System.out.println("Sexo inválido: não é 'm' nem 'f'");
        }

        if(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")){
            System.out.println("Estado civil válido: 's', 'c', 'v' ou 'd'");
        }else{
            System.out.println("Estado civil inválido: precisa ser 's', 'c', 'v' ou 'd'");
        }
    }
}

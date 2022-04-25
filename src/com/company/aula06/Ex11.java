package com.company.aula06;
//Leia um número inteiro que representa um código de DDD para discagem interurbana.
//Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
//
//	Se a entrada for qualquer outro DDD que não esteja presente na tabela acima,
//	o programa deverá informar:
//DDD nao cadastrado
//
//Entrada
//A entrada consiste de um único valor inteiro.
//
//Saída
//Imprima o nome da cidade correspondente ao DDD existente na entrada.
//Imprima DDD não cadastrado caso não exista o DDD correspondente ao número digitado.
//
//DDD
//DESTINO
//61
//Brasília
//71
//Salvador
//11
//São Paulo
//21
//Rio de Janeiro
//32
//Juiz de Fora
//19
//Campinas
//27
//Vitória
//31
//Belo Horizonte

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o DDD: ");
        int ddd = scanner.nextInt();

        switch (ddd){
            case 11:
                System.out.println("São Paulo");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 27:
                System.out.println("Vitória");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 61:
                System.out.println("Brasília");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            default:
                System.out.println("DDD nao cadastrado");

        }

        scanner.close();
    }
}

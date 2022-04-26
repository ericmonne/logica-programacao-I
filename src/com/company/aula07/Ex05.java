package com.company.aula07;
//Crie uma agenda que armazena código da pessoa, número do telefone, idade.
// Sua agenda deve possibilitar:
//(1) – inserir um contato
//(2) – Remover um contato

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int agenda = 1000;
        int codigos[] = new int[agenda];
        String numerosTelefone[] = new String[agenda];
        int idades[] = new int[agenda];

        int acaoContato;
        int codigo;

        while(true) {
            System.out.print("Digite 1 para INSERIR novo contato, 2 para REMOVER um contato ou 3 para SAIR: ");
            acaoContato = Integer.parseInt(scanner.nextLine());
            if (acaoContato == 1) {
                System.out.print("Informe o código: ");
                codigo = Integer.parseInt(scanner.nextLine());
                codigos[codigo] = codigo;
                System.out.print("Informe o número de telefone: ");
                numerosTelefone[codigo] = scanner.nextLine();
                System.out.print("Informe a idade: ");
                idades[codigo] = Integer.parseInt(scanner.nextLine());
            }
            if (acaoContato == 2){
                System.out.print("Informe o código: ");
                codigo = Integer.parseInt(scanner.nextLine());
                for(int c : codigos) {
                    if (codigo == c){
                        codigos[codigo] = 0;
                        numerosTelefone[codigo] = null;
                        idades[codigo] = 0;
                        break;
                    }
                }
            }
            if(acaoContato == 3){
                break;
            }
        }

        System.out.println("---AGENDA TELEFONICA---");
        for (int i = 0; i < agenda; i++) {
            if(codigos[i] != 0) {
                System.out.printf("Código: %d - Telefone: %s - Idade: %d\n", codigos[i], numerosTelefone[i], idades[i]);
            }
        }

        scanner.close();
    }
}

package com.company.aula05;

public class Matriz {
    public static void main(String[] args) {
//        int temperaturasPorEstacao[][] = {{38, 28, 27, 30 },{35, 22, 21, 19},{41, 18, 21, 34}};
//
//        String estados[] = {"Goiás", "São Paulo", "Minas Gerais"};
//        String estacoes[] = {"Verão", "Inverno", "Primavera", "Outono"};
//
//        for(int i = 0; i < temperaturasPorEstacao.length; i++){
//            System.out.printf("ESTADO: %s\n", estados[i]);
//            for(int j = 0; j < temperaturasPorEstacao[i].length; j++){
//                System.out.printf("Estação %s: %d\n", estacoes[j], temperaturasPorEstacao[i][j]);
//            }
//            System.out.println("\n");
//        }

        String paises[][] = new String[3][2];
        paises[0][0] = "Brasil";
        paises[1][0] = "Argentina";
        paises[2][0] = "Chile";

        paises[0][1] = "França";
        paises[1][1] = "Alemanha";
        paises[2][1] = "Portugal";

        for (int i = 0; i< paises.length; i++){
            for(int j = 0; j< paises[i].length; j++){
                System.out.printf("%s \t", paises[i][j]);
            }
            System.out.println();
        }

    }
}

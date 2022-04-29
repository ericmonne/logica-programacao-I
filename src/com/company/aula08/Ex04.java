package com.company.aula08;
//Foi feita uma estatística em cinco cidades brasileiras
// para coletar dados sobre acidentes de trânsito.
// Foram obtidos os seguintes dados:
//Código da cidade;
//Número de veículos de passeio (em 2021);
//Número de acidentes de trânsito com vítimas (em 2021).
// Deseja-se saber:
//Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
//Qual a média de veículos nas cinco cidades juntas;
//Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

public class Ex04 {
    public static void main(String[] args) {
        int quantidadeCidades = 5;
        String[] nomeCidades = {"São Paulo", "Niterói", "Rondonópolis", "Macapá", "Cajazeiras"};
        int[] codigoCidades = {11, 21, 66, 96, 83};
        int[] quantidadeVeiculosPasseio = {2006040, 150430, 60301, 1904, 1833};
        int[] acidentesTransitoComVitimas = {39305, 1929, 6943, 200, 103};
        double[] indiceAcidentes = new double[quantidadeCidades];

        String cidadeMaiorIndice = nomeCidades[0];
        String cidadeMenorIndice = nomeCidades[0];
        int totalVeiculosPasseio = 0;

        int totalAcidentesPequenasFrotas = 0;
        int quantidadePequenasFrotas = 0;


        for (int i = 0; i < quantidadeCidades; i++) {
            indiceAcidentes[i] = (double) acidentesTransitoComVitimas[i] / quantidadeVeiculosPasseio[i] * 10000;
            totalVeiculosPasseio += quantidadeVeiculosPasseio[i];
            if (quantidadeVeiculosPasseio[i] < 2000) {
                quantidadePequenasFrotas++;
                totalAcidentesPequenasFrotas += acidentesTransitoComVitimas[i];
            }
        }
        double maiorIndice = indiceAcidentes[0];
        double menorIndice = indiceAcidentes[0];
        for (int i = 0; i < quantidadeCidades; i++) {

            if (indiceAcidentes[i] > maiorIndice) {
                maiorIndice = indiceAcidentes[i];
                cidadeMaiorIndice = nomeCidades[i];
            }
            if (indiceAcidentes[i] < menorIndice) {
                menorIndice = indiceAcidentes[i];
                cidadeMenorIndice = nomeCidades[i];
            }

        }

        double mediaVeiculos = (double) totalVeiculosPasseio / 5;
        double mediaAcidentesFrotasMenores = (double) totalAcidentesPequenasFrotas / quantidadePequenasFrotas;

        System.out.printf("%s tem o maior índice de acidentes de trânsito: %.2f por 10mil veículos\n", cidadeMaiorIndice, maiorIndice);
        System.out.printf("%s tem o menor índice de acidentes de trânsito: %.2f por 10mil veículos\n", cidadeMenorIndice, menorIndice);
        System.out.printf("Média de veículos: %.2f veículos por cidade\n", mediaVeiculos);
        System.out.printf("Média de acidentes das cidades com menos de 2000 veículos: %.2f acidentes por cidade", mediaAcidentesFrotasMenores);
    }
}


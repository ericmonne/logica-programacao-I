package com.company;

public class Main {

    public static void main(String[] args) {
	
        boolean verdadeiro = true;
        boolean falso = false;
        boolean teste = (verdadeiro ^ !falso);
        System.out.println(teste);
    }
}

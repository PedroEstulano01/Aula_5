
package com.mycompany.vetoreint;

import java.util.Scanner;

public class Vetoreint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o " + (i+1) + "º número do primeiro vetor:");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o " + (i+1) + "º número do segundo vetor:");
            vetor2[i] = scanner.nextInt();
        }
        int produtoInterno = calcularProdutoInterno(vetor1, vetor2);
        System.out.println("O produto interno dos dois vetores é: " + produtoInterno);
    }

    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2) {
        int produtoInterno = 0;
        for (int i = 0; i < vetor1.length; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }
        return produtoInterno;
    }
}
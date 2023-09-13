
package com.mycompany.function;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetor[i] = scanner.nextInt();
        }
        String resultado = verificarOrdem(vetor);
        System.out.println(resultado);
    }

    public static String verificarOrdem(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i+1]) {
                crescente = false;
            }
            if (vetor[i] < vetor[i+1]) {
                decrescente = false;
            }
        }
        if (crescente) {
            return "ORDENAÇÃO CRESCENTE";
        } else if (decrescente) {
            return "ORDENAÇÃO DECRESCENTE";
        } else {
            return "NÃO ESTÁ ORDENADO";
        }
    }
}

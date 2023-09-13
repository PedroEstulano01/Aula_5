
package com.mycompany.invertevet;

import java.util.Scanner;

public class InverteVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetor[i] = scanner.nextInt();
        }
        inverterVetor(vetor);
        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i+1) + " - " + vetor[i]);
        }
    }

    public static void inverterVetor(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            inicio++;
            fim--;
        }
    }
}


package com.mycompany.imprimirvet;


import java.util.Arrays;
import java.util.Scanner;

public class ImprimirVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        boolean dadosPreenchidos = false;
        boolean vetorOrdenado = false;

        while (true) {
            System.out.println("MENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.println("OPCAO:");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite numero " + (i+1) + ":");
                    vetor[i] = scanner.nextInt();
                }
                dadosPreenchidos = true;
                vetorOrdenado = false;
            } else if (opcao == 2) {
                if (!dadosPreenchidos) {
                    System.out.println("Escolha primeiro opcao 1");
                    continue;
                }
                Arrays.sort(vetor);
                vetorOrdenado = true;
            } else if (opcao == 3) {
                if (!dadosPreenchidos) {
                    System.out.println("Escolha primeiro opcao 1");
                    continue;
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(vetor[i]);
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opcao invalida");
            }
        }
    }
}
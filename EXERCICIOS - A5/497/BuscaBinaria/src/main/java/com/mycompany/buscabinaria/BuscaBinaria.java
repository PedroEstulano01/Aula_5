

package com.mycompany.buscabinaria;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite numero " + (i+1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Ordenando os números
        Arrays.sort(numeros);

        System.out.println("Digite numero de busca:");
        int chave = scanner.nextInt();

        // Busca binária
        int posicao = buscaBinaria(numeros, chave);

        if (posicao == -1) {
            System.out.println("NÃO ENCONTRADO");
        } else {
            System.out.println("Posição no vetor: " + (posicao + 1));
        }
    }

    public static int buscaBinaria(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == chave) {
                return meio;
            } else if (array[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Não encontrado
    }
}


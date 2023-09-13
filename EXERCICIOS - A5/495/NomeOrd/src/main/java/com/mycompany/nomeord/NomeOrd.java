
package com.mycompany.nomeord;

import java.util.Scanner;

public class NomeOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite nome:");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareTo(nomes[j+1]) > 0) {
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = tempNome;
                }
            }
        }

        System.out.println("\nNOMES ORDENADOS\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
    }
}

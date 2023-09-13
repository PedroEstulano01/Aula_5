

package com.mycompany.caractere;

import java.util.Scanner;

public class Caractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorInteiros = new int[6];
        char[] vetorCaracteres = new char[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetorInteiros[i] = scanner.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i+1) + "º caractere:");
            vetorCaracteres[i] = scanner.next().charAt(0);
        }
        imprimirCaracteres(vetorInteiros, vetorCaracteres);
    }

    public static void imprimirCaracteres(int[] vetorInteiros, char[] vetorCaracteres) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            for (int j = 0; j < vetorInteiros[i]; j++) {
                System.out.print(vetorCaracteres[i]);
            }
            System.out.println();
        }
    }
}
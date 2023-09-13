
package com.mycompany.ta;

import java.util.Scanner;

public class TA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a " + (i+1) + "ª palavra:");
            palavras[i] = scanner.nextLine();
        }
        System.out.println("Digite o caractere que deseja substituir:");
        char caractere = scanner.next().charAt(0);
        int totalSubstituicoes = 0;
        for (int i = 0; i < palavras.length; i++) {
            int substituicoesNaPalavra = substituirCaractere(palavras[i], caractere);
            totalSubstituicoes += substituicoesNaPalavra;
            System.out.println((i+1) + " - " + palavras[i]);
        }
        System.out.println("Total de caracteres substituídos: " + totalSubstituicoes);
    }

    public static int substituirCaractere(String palavra, char caractere) {
        int contador = 0;
        char[] arrayCaracteres = palavra.toCharArray();
        for (int i = 0; i < arrayCaracteres.length; i++) {
            if (arrayCaracteres[i] == caractere) {
                arrayCaracteres[i] = '*';
                contador++;
            }
        }
        palavra = new String(arrayCaracteres);
        return contador;
    }
}


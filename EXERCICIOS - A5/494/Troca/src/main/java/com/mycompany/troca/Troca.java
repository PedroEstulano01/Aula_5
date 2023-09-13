

package com.mycompany.troca;

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        String[] enderecos = new String[3];
        String[] profissoes = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite nome:");
            nomes[i] = scanner.nextLine();
            System.out.println("Digite endereco:");
            enderecos[i] = scanner.nextLine();
            System.out.println("Digite profissao:");
            profissoes[i] = scanner.nextLine();
        }

        // Ordenando as pessoas pelo nome
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareTo(nomes[j+1]) > 0) {
                    // Troca de nomes
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = tempNome;

                    // Troca de enderecos
                    String tempEndereco = enderecos[j];
                    enderecos[j] = enderecos[j+1];
                    enderecos[j+1] = tempEndereco;

                    // Troca de profissoes
                    String tempProfissao = profissoes[j];
                    profissoes[j] = profissoes[j+1];
                    profissoes[j+1] = tempProfissao;
                }
            }
        }

        // Imprimindo as pessoas ordenadas
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + " " + enderecos[i] + " " + profissoes[i]);
        }
    }
}


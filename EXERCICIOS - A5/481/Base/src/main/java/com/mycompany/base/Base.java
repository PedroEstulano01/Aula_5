
package com.mycompany.base;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite um número decimal:");
            int num = scanner.nextInt();
            System.out.println("Digite a base (entre 2 e 10):");
            int base = scanner.nextInt();
            if (base < 2 || base > 10) {
                System.out.println("Base inválida. Por favor, digite um número entre 2 e 10.");
                return;
            }
            System.out.println("O número " + num + " na base " + base + " é: " + convertToBase(num, base));
            System.out.println("\nDeseja converter outro número?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            opcao = scanner.nextInt();
        } while (opcao == 1);
    }

    public static String convertToBase(int num, int base) {
        if (num == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.insert(0, num % base);
            num /= base;
        }
        return result.toString();
    }
}
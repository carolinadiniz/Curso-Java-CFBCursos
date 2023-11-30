/* Escreva um programa que leia uma sequência de números inteiros do teclado até que o usuário digite -1. Em seguida, o programa deve imprimir a soma dos números positivos e a quantidade de números negativos, excluindo o -1. Use o comando break para encerrar a leitura. */

package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        int soma = 0;

        while(true) {
            System.out.print("Digite um numero: ");
            value = sc.nextInt();

            if(value == -1) break;

            soma += value;
        }

        System.out.printf("A soma destes valores e igual a: %d", soma);

    }
}

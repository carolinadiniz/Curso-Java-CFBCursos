/*Escreva um programa em java que leia um array de 10 números inteiros e imprima a soma dos elementos pares e a média dos elementos ímpares */
package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        
        int[] numeros = {3, 5, 1, 1, 50, 6, 4, 2, 18, 10};
        int somaPar = 0;
        int somaImpar = 0;
        int countImpar = 0;
        double mediaImpar;

        for(int num:numeros) {
            if((num%2)==0) {
                somaPar += num;
            } else {
                somaImpar += num;
                countImpar++;
            }
        }

        mediaImpar = somaImpar/countImpar;

        System.out.printf("A soma de todos os numero pares e: %d%n", somaPar);
        System.out.printf("A media de todos os numero impares e: %.2f%n", mediaImpar);
        
    }
}

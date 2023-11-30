/*Escreva um programa que imprima os números de 1 a 10, mas pule o número 5 usando o comando continue. */
package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(" - " + i);
        }
        
    }
}

/*Exercício 1: Escreva um programa que receba um número inteiro de 1 a 7 e imprima o nome do dia da semana correspondente. Use o comando switch case para verificar o número e imprimir o resultado. Por exemplo, se o número for 1, imprima “Domingo”. Se o número for 2, imprima “Segunda-feira”. E assim por diante. */
package Exercicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        String result;

        System.out.println("Digite um numero entre 1 e 7:");
        day = sc.nextInt();

        switch(day) {
            case 1:
                result = "Domingo";
                break;
            case 2:
                result = "Segunda-feira";
                break;
            case 3:
                result = "Terca-feira";
                break;
            case 4:
                result = "Quarta-feira";
                break;
            case 5:
                result = "Quinta-feira";
                break;
            case 6:
                result = "Sexta-feira";
                break;
            case 7:
                result = "Sábado";
                break;
            default:
                result = "ERROR: Number out of range";
                break;
        }

        System.out.printf("%s", result);

    }
}

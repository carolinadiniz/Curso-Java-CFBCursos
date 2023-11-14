/* Exercício: Crie um programa Java que use a classe Scanner para obter do usuário uma série de 
números inteiros até que o usuário insira 0. O programa deve calcular e exibir a soma e a média 
de todos os números inseridos. Além disso, o programa deve determinar e exibir o maior e o menor 
número inserido.*/

import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        // Criando e instanciando objeto
        Scanner scan = new Scanner(System.in);

        int soma=0;
        int numUsuario=0;
        int count=-1;
        int maxNum = 0;
        int minNum = 0;
        double media=0;

        System.out.println("\n\n * * MAQUINA DE SOMA * * ");
        System.out.println("[Digite 0 para parar]\n");

        do {
            System.out.print("Digite um número inteiro: ");
            numUsuario = scan.nextInt();
            soma += numUsuario;
            count++;

            if(count==0) minNum = numUsuario;

            if(numUsuario != 0) {
                if(numUsuario>maxNum) maxNum = numUsuario;
                if(numUsuario<minNum) minNum = numUsuario;
            }
        }
        while (numUsuario != 0);
        
        media = (double) soma/count;

        System.out.println("\nA soma dos numeros e igual: " + soma);
        System.out.println("A media dos numeros e igual: " + media);
        System.out.println("O maior número digitado foi: " + maxNum);
        System.out.println("O menor número digitado foi: " + minNum);
    }
}
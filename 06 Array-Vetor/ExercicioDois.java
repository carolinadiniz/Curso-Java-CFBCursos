/*Médio: Escreva um programa que crie um array bidimensional de caracteres chamado tabuleiro 
com 3 linhas e 3 colunas e preencha-o com os símbolos ‘X’ e ‘O’ de forma alternada. Em seguida, 
imprima na tela o tabuleiro como se fosse um jogo da velha. */

public class ExercicioDois {

    

    public static void main(String[] args) {
        int count = 0;
        
        char[][] tabuleiro = new char[3][3];

        for(int linha=0; linha < 3; linha++) {
            for(int coluna=0; coluna < 3; coluna++) {

                if(count%2 == 0) {
                    tabuleiro[linha][coluna] = 'O';
                } else {
                    tabuleiro[linha][coluna] = 'X';
                }

                count++;
            }
        }

        for (int linha=0; linha < 3; linha++) {
            for(int coluna=0; coluna < 3; coluna++) {
                System.out.printf("%c", tabuleiro[linha][coluna]);
                if (coluna!=2) System.out.print("|");
            }
            if (linha != 2) System.out.printf("%n______%n");
        }
    } 
    
}

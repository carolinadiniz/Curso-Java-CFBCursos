/* Escreva um código que copie o conteúdo de um array de caracteres para outro. Use o método System.arraycopy() para isso. */

public class exercicioTres{
    public static void main(String[] args) {
        final int TAM = 5;

        final char[] letras = {'a','b','c','d','e'};
        final char[] copia = new char[TAM];

        System.arraycopy(letras, 0, copia, 0, TAM);

        for(char letra:copia) {
            System.out.printf("%c, ", letra);
        }
    }
}

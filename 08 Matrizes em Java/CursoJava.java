import java.security.SecureRandom;

public class CursoJava {
    public static void main(String[] args) {
        
        final int LINHAS = 3;
        final int COLUNAS = 3;
        final int[][] numeros = new int[LINHAS][COLUNAS];
        final int[][] num = {{10,15,20},{30, 40,50},{60,70,80}};

        for(int row=0; row < LINHAS; row++) {
            for (int column=0; column < COLUNAS; column++) {
                numeros[row][column] = new SecureRandom().nextInt(100);
            }
        }

        
        for(int row=0; row < LINHAS; row++) {
            for (int column=0; column < COLUNAS; column++) {
                System.out.printf("%2d | ", numeros[row][column]);
            }
            System.out.println("");
        }
        System.out.println("");

        
        
        for(int[] n:numeros) {
            for (int v:n) {
                System.out.printf("%2d | ", v);
            }
            System.out.println("");
        }


    }
}
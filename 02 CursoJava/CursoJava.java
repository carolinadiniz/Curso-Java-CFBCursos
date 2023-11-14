public class CursoJava{
    public static void main(String[] args){
        //Diferentes tipos de Print
        System.out.print("Olá mundo!\n");
        System.out.println("Curso de Java");
        System.out.printf("Nick: %s - Ano: %d", "Kaworii", 2023);

        // Declaração de variável sem inicialização
        // Obs: tentei compilar sem incializar a variavel, porém deu erro. Pesquisando sobre o motivo, descobri que todas variáveis devem ser inicializadas antes de serem usadas.
        int num=24;
        String nome= "Carol";

        System.out.printf("\nNome: %s%nIdade: %d",nome, num);


        // Operações básicas com variáveis
        int n1=10, n2=20, n3=30, res;
        res = n1+n2+n3;

        System.out.printf("\nA soma de %d + %d + %d é igual à: %d", n1, n2, n3, res);
    }
}
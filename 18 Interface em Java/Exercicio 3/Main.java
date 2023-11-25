public class Main {
    public static void main(String[] args) {
        Soma oculos = new Soma(13, 16);
        Subtracao mesa = new Subtracao(21, 25);
        Multiplicacao cadeira = new Multiplicacao(31, 51);
        Divisao fone = new Divisao(65, 74);

        System.out.printf("Soma: %.2f\n", oculos.calcular());
        System.out.printf("Subtracao: %.2f\n", mesa.calcular());
        System.out.printf("Multiplicacao: %.2f\n", cadeira.calcular());
        System.out.printf("Divisao: %.2f\n", fone.calcular());
    }
}

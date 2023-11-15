public class Aula09 {
    public static void main(String[] args) {

        msg("Oi");

        System.out.println(soma(2.1,2.3));
        System.out.println(soma2(2, 3));
    }

    public static int soma(int... numeros) {
        int res=0;
        for(int n:numeros) {
            res += n;
        }
        return res;
    }
    public static Double soma(Double... numeros) {
        Double res=0.0;
        for(Double n:numeros) {
            res += n;
        }
        return res;
    }

    public static int soma2(int x, int y) {
        final int res = x + y;
        return res;
    }

    public static void msg(String message) {
        System.out.println(message);
    }
}
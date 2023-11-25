public class Calculadora {
    private double a;
    private double b;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public static double somar(double x, double y) {
        return x + y;
    }
    public static double subtrair(double x, double y) {
        return x - y;
    }
    public static double multiplicar(double x, double y) {
        return x * y;
    }
    public static double dividir(double x, double y) {
        return x / y;
    }
}
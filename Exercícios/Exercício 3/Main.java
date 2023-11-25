import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        calc.setA(a);
        calc.setB(b);

        System.out.println("A soma de a e b é: " + Calculadora.somar(calc.getA(), calc.getB()));
        System.out.println("A subtração de a e b é: " + Calculadora.subtrair(calc.getA(), calc.getB()));
        System.out.println("A multiplicação de a e b é: " + Calculadora.multiplicar(calc.getA(), calc.getB()));
        System.out.println("A divisão de a e b é: " + Calculadora.dividir(calc.getA(), calc.getB()));
    }
}

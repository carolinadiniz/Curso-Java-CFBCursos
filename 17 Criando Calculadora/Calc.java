import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resultado = new Numero();
        String opc = "S";

        while(opc.equals("s") || opc.equals("S")) {
             System.out.printf("\nDigite o primeiro valor:");
            n1.setValor(sc.nextInt());
            System.out.printf("\nDigite o segundo valor:");
            n2.setValor(sc.nextInt());

            resultado.setValor(n1.getValor()+n2.getValor());
            System.out.printf("\nA soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), resultado.getValor());
            System.out.printf("\nDeseja somar outro valor?");
            opc=sc.next();
            System.out.println("\n\n\n");
            
        }
    }   
}
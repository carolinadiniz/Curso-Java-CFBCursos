import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta carol = new Conta("00023", "Carolina");

        carol.depositar(21.0);
        carol.sacar(10.00);
    }
    
}

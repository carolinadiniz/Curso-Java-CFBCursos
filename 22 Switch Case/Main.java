public class Main {
    public static void main(String[] args) {
        
        int n1, n2, res;
        String op = "+";

        n1=10; n2=5; res=0;
        

        switch(op) {
            case "+": 
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            default:
                System.out.printf("%s%n", "Operador invalido");
                break;
        }

        System.out.printf("Operacao:%s : Resultado:%d%n", op, res);
    }
}
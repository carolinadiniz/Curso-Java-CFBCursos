public class Main {
    public static void main(String[] args) {
        Vendedor claudio = new Vendedor("Claudio", 2312, 1000.00);
        Gerente valdeci = new Gerente("Valdeci", 12312, 3000);

        claudio.setVendas(3000);
        System.out.printf("O salario final do vendedor e: R$ %.2f\n", claudio.calcularSalarioFinal());
        
        
        
        System.out.printf("O salario final do gerente e: R$ %.2f\n", valdeci.calcularSalarioFinal());
        
        

    }
}

public class Divisao implements Operacao{
    private double dividendo;
    private double divisor;
    
    public Divisao(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    public double calcular() {
        if (divisor == 0) {
            System.out.println("ERROR DIVISIOR NAO PODE SER ZERO!");
            return 0;
        } else {
            return this.dividendo/this.divisor;
        }
    }
}

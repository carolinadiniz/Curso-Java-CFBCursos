public class Soma implements Operacao {
    private double x;
    private double y;
    
    public Soma(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcular() {
        return this.x + this.y;
    }
}

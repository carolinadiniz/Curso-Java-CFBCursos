public class Subtracao implements Operacao{
    private double x;
    private double y;

    public Subtracao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcular() {
        return this.x - this.y;
    }
}

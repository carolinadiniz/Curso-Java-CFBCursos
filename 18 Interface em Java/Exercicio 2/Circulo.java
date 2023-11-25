import java.lang.Math;

public class Circulo implements Forma {
    private double perimetro;
    private double area;
    final private double PI = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    @Override
    public void calcularArea() {
        this.area = this.PI * (Math.pow(raio,2));
        System.out.printf("\nA area do circulo e: %.2f", area);
    }
    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * this.PI * raio;
        System.out.printf("\nO Perimetro do circulo e: %.2f", perimetro);
    }
}

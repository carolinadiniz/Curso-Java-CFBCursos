public class Retangulo implements Forma{
    private double perimetro;
    private double area;
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    
    @Override
    public void calcularArea() {
        this.area = this.base * this.altura;
        System.out.printf("\nA area do retangulo e: %.2f", area);
    }
    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
        System.out.printf("\nO Perimetro do retangulo e: %.2f", perimetro);
    }
}

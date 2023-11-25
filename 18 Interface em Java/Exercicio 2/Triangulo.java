public class Triangulo implements Forma {
    private double area;
    private double perimetro;
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getArea() {
        return area;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    
    @Override
    public void calcularArea() {
        this.area = (this.base * this.altura) / 2.0;
        System.out.printf("\nA area do triangulo e: %.2f", area);
    }
    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
        System.out.printf("\nO Perimetro do triangulo e: %.2f", perimetro);
    }
}
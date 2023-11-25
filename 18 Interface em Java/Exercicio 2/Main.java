public class Main {
    public static void main(String[] args) {
        Circulo cir = new Circulo(3);
        Retangulo ret = new Retangulo(4, 10);
        Triangulo tri = new Triangulo(13, 7, 15, 9, 12);


        cir.calcularArea();
        cir.calcularPerimetro();

        ret.calcularArea();
        ret.calcularPerimetro();

        tri.calcularArea();
        tri.calcularPerimetro();


    }
}

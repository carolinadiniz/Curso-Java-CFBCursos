public class Gerente extends Funcionario{
    final private static int BONUS = 10;
    final private static int IMPOSTO = 5;
    public double salarioFinal;

    public Gerente(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);       
    }

    public double calcularSalarioFinal() {
        this.salarioFinal = super.getSalarioBase() + (super.getSalarioBase() * (BONUS/(double)100));
        this.salarioFinal = this.salarioFinal - (this.salarioFinal * (IMPOSTO/(double)100));
        return this.salarioFinal;
    }
}

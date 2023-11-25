public class Vendedor extends Funcionario {
    final private static int COMISSAO = 15;
    final private static int IMPOSTO = 8;
    private double vendas;
    private double salarioFinal;
    
    public Vendedor(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);       
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double getVendas() {
        return this.vendas;
    }

    public double calcularSalarioFinal() {
        this.salarioFinal = super.getSalarioBase() + (this.vendas*(COMISSAO/(double)100));
        this.salarioFinal = this.salarioFinal - (this.salarioFinal*(IMPOSTO/(double)100));
        return this.salarioFinal;
    }
}

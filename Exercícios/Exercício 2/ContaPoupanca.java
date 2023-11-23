public class ContaPoupanca extends Conta{
    private int taxa;
    private double rendimento;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public int getTaxa() {
        return taxa;
    }
    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public void render() {
       rendimento = super.getSaldo() + (super.getSaldo() * ((double)this.taxa / 100));
       super.setSaldo(rendimento);
    }

    public void imprimir() {
        super.imprimir();
        System.out.printf("Taxa de rendimento: %d\n", this.taxa);
    }
}

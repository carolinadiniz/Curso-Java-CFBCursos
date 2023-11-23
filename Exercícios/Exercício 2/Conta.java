public class Conta {
    private String numero;
    private double saldo;
    private double limite;

    public Conta(String numero) {
        this.numero = numero;
        this.limite = 10;
    }

    public double getLimite() {
        return limite;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            System.out.printf("DEPOSITO CONCLUIDO \nSaldo Atual: R$ %.2f\n\n", this.saldo);
        } else {
            System.out.println("ERRO AO DEPOSITAR \nValor Inválido!\n\n");
        }
    }

    public void sacar(double valor) {
        if(valor <= (saldo+limite)) {
            this.saldo -= valor;
            System.out.printf("SAQUE CONCLUIDO \nSaldo Atual: R$ %.2f\n\n", this.saldo);
        } else {
            System.out.println("ERRO AO SACAR \nSaldo Insuficiente!\n\n");
        }
    }

    public void imprimir() {
        System.out.printf("Numero: %s\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.printf("Limite: %.2f\n", this.limite);
    }
}
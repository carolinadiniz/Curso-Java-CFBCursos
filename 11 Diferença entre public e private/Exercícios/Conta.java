/* Crie uma classe chamada Conta que representa uma conta bancária. A classe deve ter os seguintes atributos privados: numero, saldo e titular. A classe deve ter os seguintes métodos públicos: getNumero, getSaldo, getTitular, setNumero, setTitular, depositar e sacar. O método depositar deve receber um valor como parâmetro e adicionar esse valor ao saldo da conta. O método sacar deve receber um valor como parâmetro e subtrair esse valor do saldo da conta, se houver saldo suficiente. Caso contrário, deve imprimir uma mensagem de erro. Use o operador this para referenciar os atributos da classe dentro dos métodos. */


public class Conta {

    private String numero="";
    private String titular="";
    private double saldo=0.0;

    public Conta(String numero, String titular) {
        setNumero(numero);
        setTitular(titular);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    private void setNumero(String numero) {
        this.numero = numero;
    }

    private void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
        } else {
            System.out.println("ERROR: Impossivel depositar um valor negativo.");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            imprimirSaldo();
        } else {
            System.out.println("SALDO INSUFICIENTE!");
        }
    }
    
    public void imprimirSaldo() {
        System.out.printf("SALDO ATUAL: R$ %.2f %n", getSaldo());
    }

}
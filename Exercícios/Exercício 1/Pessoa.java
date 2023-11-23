public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimir() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Idade: %d%n", this.idade);
        System.out.printf("Altura: %.2f%n", this.altura);
    }
}
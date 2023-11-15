/* Modifique a classe Jogador para que ela tenha um atributo chamado nome, que deve ser passado como parâmetro no construtor. Além disso, crie um método chamado getNome() que retorna o nome do jogador. No método main, crie três objetos da classe Jogador com nomes diferentes e imprima seus nomes usando o método getNome(). */
public class Main {
    public static void main(String[] args) {

        final String[] arrayNomesVasco = {"Sara", "Akali", "Carolina"};
        final String[] arrayNomesFlamengo = {"Preda", "Arroba", "Fulano"};

        Time vasco = new Time( arrayNomesVasco);
        Time flamengo = new Time( arrayNomesFlamengo);
        
        System.out.println("ESCALACAO DO TIME DO VASCO:");
        vasco.imprimirTime();

        System.out.println("\nESCALACAO DO TIME DO FLAMENGO:");
        flamengo.imprimirTime();
        
    }
}
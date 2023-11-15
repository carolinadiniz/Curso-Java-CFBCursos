/* Modifique a classe Jogador para que ela tenha um atributo chamado nome, que deve ser passado como parâmetro no construtor. Além disso, crie um método chamado getNome() que retorna o nome do jogador. No método main, crie três objetos da classe Jogador com nomes diferentes e imprima seus nomes usando o método getNome(). */
public class Main {
    public static void main(String[] args) {

        Jogador player1 = new Jogador(3, "Sara");
        Jogador player2 = new Jogador(7, "Akali");
        Jogador player3 = new Jogador(21, "Carolina");

        System.out.println(player1.getNome());
        System.out.println(player2.getNome());
        System.out.println(player3.getNome());
        
    }
}
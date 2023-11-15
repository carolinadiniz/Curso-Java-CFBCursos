/* 1. Modifique a classe Jogador para que ela tenha um atributo chamado nome, que deve ser passado como parâmetro no construtor. Além disso, crie um método chamado getNome() que retorna o nome do jogador. No método main, crie três objetos da classe Jogador com nomes diferentes e imprima seus nomes usando o método getNome().

2. Crie uma classe chamada Time que representa um time de futebol. Essa classe deve ter um atributo chamado jogadores, que é um array de objetos da classe Jogador. Essa classe também deve ter um construtor que recebe um array de nomes de jogadores e cria um objeto da classe Jogador para cada nome, armazenando-os no array jogadores. Além disso, crie um método chamado imprimirTime() que imprime o nome de todos os jogadores do time. No método main, crie dois objetos da classe Time com nomes de jogadores diferentes e chame o método imprimirTime() para cada um deles.

3. Crie uma classe chamada Partida que representa uma partida de futebol entre dois times. Essa classe deve ter dois atributos chamados timeA e timeB, que são objetos da classe Time. Essa classe também deve ter um construtor que recebe dois objetos da classe Time e os atribui aos atributos timeA e timeB. Além disso, crie um método chamado jogarPartida() que simula o resultado da partida, gerando um número aleatório entre 0 e 5 para cada time, que representa a quantidade de gols marcados. Esse método deve imprimir o nome dos times, a quantidade de gols marcados por cada um e o vencedor da partida (ou empate, se houver). No método main, crie dois objetos da classe Time com nomes de jogadores diferentes, crie um objeto da classe Partida com esses dois times e chame o método jogarPartida().*/

public class Main {
    public static void main(String[] args) {

        final String[] arrayNomesVasco = {"Sara", "Akali", "Carolina"};
        final String[] arrayNomesFlamengo = {"Pedra", "Poste", "Cadeira"};

        Time vasco = new Time("Vasco", arrayNomesVasco);
        Time flamengo = new Time("Flamengo", arrayNomesFlamengo);
        
        Partida brasileirao = new Partida(vasco, flamengo);
        
        brasileirao.jogarPartida();
    }
}
public class Time {
    Jogador[] jogadores;

    public Time(String[] arrayNomes) {

        jogadores = new Jogador[arrayNomes.length];

        for(int i=0; i < arrayNomes.length; i++) {
            jogadores[i] = new Jogador(i, arrayNomes[i]);
        }
    }


    public void imprimirTime() {
        for(int i=0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].getNome());
        }
    } 
    
}

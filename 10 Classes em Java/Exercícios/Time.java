public class Time {
    final Jogador[] jogadores;
    final String nomeTime;

    public Time(String nTime, String[] arrayNomes) {
        
        nomeTime = nTime;

        jogadores = new Jogador[arrayNomes.length];

        for(int i=0; i < arrayNomes.length; i++) {
            jogadores[i] = new Jogador(i, arrayNomes[i]);
        }
    }

    public String getName() {
        return nomeTime;
    }


    public void imprimirTime() {
        for(int i=0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].getNome());
        }
    } 
    
}

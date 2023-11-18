public class Jogador {

    private int num = 0;
    private int vidas=1;
    
    public Jogador(int num) {
        this.num=num;
        this.vidas = 3;
        System.out.printf("Jogador numero %d criado!%n",num);
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas){
        this.vidas = vidas;
        
    }

}
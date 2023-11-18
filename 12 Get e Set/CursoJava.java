public class CursoJava {
    public static void main(String[] args) {

        int num =0;
        
        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);
        Jogador j3 = new Jogador(num++); 

        /*j1.num=10;
        System.out.println(j1.num);*/
        
        //j1.vidas=100;

        System.out.println(j1.getVidas());

    }
}

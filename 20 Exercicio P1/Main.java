public class Main {
    public static void main(String[] args) {

        Sapo sapinho = new Sapo(10, 10, 10);
        Aranha aranha = new Aranha(5, 5, 5, 3);
        Formiga formiga = new Formiga(2, 2, 2);
        Vegetal alface = new Vegetal(3);
        Vegetal tomate = new Vegetal(5);
        Vegetal beterraba  = new Vegetal(10);

        aranha.info();
        aranha.atacar(formiga);
        
        aranha.info();
    }
}

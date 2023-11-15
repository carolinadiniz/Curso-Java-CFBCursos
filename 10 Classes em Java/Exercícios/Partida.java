import java.util.Random;

public class Partida {
    Random random = new Random();
    Time timeA;
    Time timeB;

    public Partida(Time t1, Time t2) {
        timeA = t1;
        timeB = t2;

    }

    public void jogarPartida() {
        int golsTimeA = random.nextInt(5);
        int golsTimeB = random.nextInt(5);

        System.out.printf("%s %d vs %d %s", timeA.getName(), golsTimeA, golsTimeB, timeB.getName());
        
        if(golsTimeA > golsTimeB) {
            System.out.printf("%nVENCEDOR %s!!!!%n", timeA.getName().toUpperCase());
        } else if(golsTimeA < golsTimeB) {
            System.out.printf("%nVENCEDOR %s!!!!%n", timeB.getName().toUpperCase());
        } else {
            System.out.printf("%nEMPATE!!!!%n");
        }

    }
}
public class Aranha extends Animal {
    private int veneno;
    public Aranha(int vel, int massa, int forca, int veneno) {
        super(vel, massa, forca);
        this.veneno=veneno;
    }
    @Override
    public void atacar(Animal inimigo) {
        if(super.getVivo()) {
            if((super.getForca() + this.veneno) > inimigo.getForca()) {
                super.setForca(super.getForca() + inimigo.getMassa());
                inimigo.setVivo(false);
            } else {
                super.setVivo(false);
            }
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toString() + " esta morto, nao pode atacar!");
            System.out.println("-------------------------");
        }
    }   
}
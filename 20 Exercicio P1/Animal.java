abstract class Animal implements SerVivo {
    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;

    public Animal(int vel, int massa, int forca) {
        this.vivo = true;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.forca = forca;
        this.vel = vel;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
    public Boolean getVivo() {
        return vivo;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getForca() {
        return forca;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }
    public int getMassa() {
        return massa;
    }

    @Override
    public void atacar(Animal inimigo) {
        if(this.vivo) {
            if(this.forca > inimigo.getForca()) {
                this.forca += inimigo.getMassa();
                inimigo.setVivo(false);
            } else {
                this.vivo = false;
            }
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toString() + " esta morto, nao pode atacar!");
            System.out.println("-------------------------");
        }
    }        
    @Override
    public void mover() {
        if(this.vivo) {
            this.x+=this.vel;
            this.y+=this.vel;
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toString() + " esta morto, nao pode mover!");
            System.out.println("-------------------------");
        }
    }
    @Override
    public void comer(int massa) {
        if(this.vivo) {
            this.forca += massa;
        } else {
            System.out.println("-------------------------");
            System.out.println(this.getClass().toString() + " esta morto, nao pode comer!");
            System.out.println("-------------------------");
        }
    }
    @Override
    public void info() {
        System.out.printf("Tipo:%s%n", getClass().toString());
        System.out.printf("Vivo:%s%n", this.getVivo() ? "sim" : "nao");
        System.out.printf("Massa:%d%n", this.massa);
        System.out.printf("Veloc.:%d%n", this.vel);
        System.out.printf("Forca.:%d%n", this.forca);
        System.out.println("-------------------------");
    }
}
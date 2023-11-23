public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.printf("Matricula: %s",this.matricula);
    }
}
public class code{
    public static void main(String[] args) {

        // Exemplos IF
        int nota=65;
        int media=60;
        int faltas=10;
        int maxFaltas=5;


        if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado(a)");          
        } else if (nota >= 40 && faltas <= maxFaltas) {
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado(a)");
        }
        System.out.println("Fim do programa");        
    }
}
import java.util.Arrays;
public class aulaSete {
    public static void main(String[] args) {

        /* Ordena os elementos de um array 
        int[] num={4,2,9,14,2,3,0,-10,2};

        Arrays.sort(num);*/
        
        /* Preenche array com valor indicado
        final int tam=10;
        int[] num= new int[tam];
        Arrays.fill(num, 3); */


        /* Copiar conteúdo de um array para outro 
        int[] lista1 = {1, 2, 3, 4, 5};
        int[] lista2 = new int[5];
        System.arraycopy(lista1, 0, lista2, 0, 5);*/


        /* Comparar arrays 
        int[] num={4,2,9,14,2,3,0,-10,2,5};
        int[] num2=new int[10];
        System.out.printf("Os arrays são iguais?%s", Arrays.equals(num,num2) ? "Sim":"Nao");*/

        
        /* Comparar arrays 
        int[] num={4,2,9,14,2,3,0,-10,2,5};
        int[] num2=new int[10];
        System.out.printf("Os arrays são iguais?%s", Arrays.equals(num,num2) ? "Sim":"Nao");*/

        /* pesquisa por posição
        int[] num={4,2,9,14,2,3,0,-10,2,5};
        int[] num2=new int[10];
        int p= 15;
        Arrays.sort(num); // É necessário o array estar ordenado para funcionar
        int pos = Arrays.binarySearch(num,p);
        System.out.printf("O elemento %d esta no array na posicao %d? %s", p, pos, pos>0 ? "Sim":"Nao");*/

        // foreach "LEITURA APENAS"
        //for(int n:lista2) {
        //    System.out.printf("%d | ", n);
        //}
    }
}
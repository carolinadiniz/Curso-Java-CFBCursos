public class Main {
    public static void main(String[] args) {
        
        int count=100;
        for(int i=0; i < count; i++) {
            if(i >= 10 && i<=60) {
                continue;
            }
            System.out.println(i);
            
        }
    }
}
package q12;

public class a {
    public static void main(String[] args){
        int k;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<=i; j++){
                if(i%2 == 0) k = 65;
                else k = 97;
                System.out.print((char)(j+k));
            }
            System.out.println();
        }
    }
}

package q12;

public class f {
    public static void main(String[] args){
        int l;
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                for(int k = 0; k<5; k++){
                    if(i%2 == 0) l = 97;
                    else l = 65;
                    System.out.print((char)(j+l));
                }
                System.out.println();
            }
        }
    }
}

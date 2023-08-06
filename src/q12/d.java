package q12;

public class d {
    public static void main(String[] args){
        for(char i = 'V'; i>='P'; i-=2){
            for(char j = 'P'; j<=i; j+=2){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

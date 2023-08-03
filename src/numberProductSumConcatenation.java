import java.util.Scanner;

public class numberProductSumConcatenation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int S = 0; int P = 1;
        for(int i = 0; i<10; i++){
            int n = in.nextInt();
            S+=n;
            P*=n;
        }
        System.out.println("Sum: " + S);
        System.out.println("Product: " + P);
        System.out.println(S + "" + P);
    }
}

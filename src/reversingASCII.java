import java.util.Scanner;

public class reversingASCII {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = in.next().charAt(0);
        int N =0;
        while(ch>0){
            int d= ch%10;
            N = N*10+d;
            ch = (char)(ch/10);
        }
        System.out.println((char)N);

    }
}

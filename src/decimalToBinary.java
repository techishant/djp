import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        String output = "";
        output = foo(n,output);

        System.out.println("(" + output + ")2");
    }

    public static String foo(int n, String output){
        if(n==1) return (n%2) + output;
        output = (n%2) + output;
        return foo(n/2, output);
    }
}

import java.util.Scanner;

public class swrt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        System.out.println("The square root is: " + Math.sqrt(n));
    }
}

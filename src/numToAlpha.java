import java.util.Scanner;

public class numToAlpha {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 26");
        int N = in.nextInt();

        System.out.println("Character: " + (char)(N+64));
    }
}

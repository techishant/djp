import java.util.Scanner;

public class characterDifference {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        char ch1 = in.next().charAt(0);
        char ch2 = in.next().charAt(0);

        int d = ch1 - ch2;
        if(d==0) System.out.println("Both characters are same.");
        else if(d<0) System.out.println("First character is smaller.");
        else System.out.println("Second character is smaller.");
    }
}

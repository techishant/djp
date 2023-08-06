import java.util.Scanner;

public class menuDrivenUnicode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for A to Z" +
                "\n Enter 2 for z to a");
        int ch = in.nextInt();

        switch (ch){
            case 1:
                System.out.println("Letters\tASCII");
                for(int i = 65; i<=90; i++){
                    System.out.println((char)i + "\t" + i);
                }
                break;
            case 2:
                System.out.println("Letters\tASCII");
                for(int i = 122; i>=97; i--){
                    System.out.println((char)i + "\t" + i);
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

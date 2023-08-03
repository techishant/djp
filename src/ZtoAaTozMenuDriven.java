import java.util.Scanner;

public class ZtoAaTozMenuDriven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Z to A" +
                "\nEnter 2 for z to a");
        int ch = in.nextInt();

        switch (ch){
            case 1:
                for(int i=90; i>=65; i--){
                    System.out.print((char)(i) + ", ");
                }
                break;
            case 2:
                for(int i = 97; i<=122; i++){
                    System.out.print((char)(i) + ", ");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

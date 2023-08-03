import java.util.Scanner;

public class FirstAndLastFiveMenuDriven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for first five uppercase Letters " +
                "\nEnter 2 for last five lowercase letters");
        int ch = in.nextInt();
        switch(ch){
            case 1:
                for(int i = 65; i<65+5; i++){
                    System.out.print((char)i + ", ");
                }
                break;
            case 2:
                for(int i = 122-4; i<=122; i++){
                    System.out.print((char)i + ", ");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

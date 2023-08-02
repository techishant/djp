import java.util.Scanner;

public class articles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = " " + str;

        for(int i = 0; i<str.length()-1; i++){
            char nextChar = Character.toUpperCase(str.charAt(i+1));
            char currChar = str.charAt(i);
            System.out.print(currChar);
            if(currChar == ' '){
                switch (nextChar) {
                    case 'A', 'E', 'I', 'O', 'U' -> {
                        System.out.print("an ");
                    }
                }
            }
        }
    }
}

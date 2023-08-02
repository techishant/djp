import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 words: ");
        String[] words = new String[1];
        for(int i = 0; i< words.length; i++){
            words[i] = in.next().toUpperCase();
        }


        for(int i = 0; i<words.length; i++){
            boolean isPalindrome = true;
            for(int j = 0; j<words[i].length()/2; j++){
                char ch1 = words[i].charAt(j);
                char ch2 = words[i].charAt(words[i].length()-1-j);
                if(ch1 != ch2){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome)  System.out.println(words[i]);
        }
    }
}

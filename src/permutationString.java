import java.util.Scanner;
public class permutationString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.next();
        System.out.println();


        foo(str, 0, str.length()-1);


    }
    public static void foo(String str, int l, int r){
        if (l == r)
            printArr(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                foo(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
    public static String swap(String str, int i, int j){
        String str2 = "";
        for(int k = 0; k<str.length(); k++){
            if(k == i) str2 += str.charAt(j);
            else if(k==j) str2 += str.charAt(i);
            else str2 += str.charAt(k);
        }
        return str2;
    }
    public static void printArr(String str) {
        System.out.println(str);
    }
}

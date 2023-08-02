import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] country = new String[10];
        String[] capital = new String[country.length];

        for (int i = 0; i < country.length; i++) {
            System.out.print("Country: ");
            country[i] = in.nextLine();
            System.out.print("Capital: ");
            capital[i] = in.nextLine();
        }

        System.out.println("Country\tCapital");
        for(int i = 0; i<country.length; i++){
            char ch = country[i].charAt(0);
            switch(ch){
                case 'A', 'E', 'I', 'O', 'U':
                    System.out.println(country[i] + "\t" + capital[i]);
                    break;
            }
        }
    }
}

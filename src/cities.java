import java.util.Scanner;
public class cities {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] cities = new String[10];
        System.out.println("Enter 10 cities name: ");
        for(int i =0; i<cities.length; i++){
            cities[i] = in.nextLine();
        }

        for(int i =0; i<cities.length; i++){
            char ch1 = cities[i].charAt(0);
            char ch2 = Character.toUpperCase(cities[i].charAt(cities[i].length()-1));

            switch(ch1) {
                case 'A', 'E', 'I', 'O', 'U':
                    break;
                default:
                    switch (ch2) {
                        case 'A', 'E', 'I', 'O', 'U':
                            System.out.println(cities[i]);
                            break;
                    }
            }
//            if(!(ch1 == 'A' || ch1 == 'E' || ch1 == 'I'|| ch1 == 'O'|| ch1 == 'U') &&
//                (ch2 == 'A' || ch2 == 'E' || ch2 == 'I'|| ch2 == 'O'|| ch2 == 'U')){
//                System.out.println(cities[i]);
//            }
        }
    }
}

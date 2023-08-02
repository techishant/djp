import java.util.Scanner;

public class citySTD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name of 10 cities along with their STD codes: ");
        String[] cities = new String[5];
        int[] stds = new int[cities.length];
        for(int i = 0; i<cities.length; i++){
            System.out.print("City: ");
            cities[i] = in.next();
            System.out.print("STD: ");
            stds[i] = in.nextInt();
        }

        System.out.print("Enter target city: ");
        String target = in.next();
        boolean found = false;
        for(int i = 0; i<cities.length; i++){
            if(cities[i].equals(target)){
                System.out.println("Search Successful!");
                System.out.println("City: " + cities[i]);
                System.out.println("STD: " + stds[i]);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Search Unsuccessful");
    }
}

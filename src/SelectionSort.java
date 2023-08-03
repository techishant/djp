public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {74,56,2,32,27};

        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<arr[min]) min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for(int i:arr){
            System.out.print(i + ", ");
        }
        System.out.println();
        forString();
    }

    public static void forString(){
        String[] arr = {"Rakesh", "Ramesh", "Abhinav", "Kartik", "Aryan"};
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j].toUpperCase().compareTo(arr[min].toUpperCase())<arr[min].toUpperCase().compareTo(arr[j].toUpperCase())) {
                    min = j;
                }
            }
            String tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for(String str:arr){
            System.out.print(str + ", ");
        }
    }
}

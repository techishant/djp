public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {9,2,74,29,21,3};

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    arr[j]   = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j]   = arr[j] - arr[j+1];
                }
            }
        }
        for(int i:arr){
            System.out.print(i + ", ");
        }
        System.out.println();

        forString();
    }

    public static void forString(){
        String[] arr = {"Rakesh", "Ramesh", "Abhinav", "Kartik", "Aryan"};

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j].toUpperCase().compareTo(arr[j+1].toUpperCase()) >
                    arr[j+1].toUpperCase().compareTo(arr[j].toUpperCase()) ){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(String str:arr){
            System.out.println(str + ", ");
        }
    }
}

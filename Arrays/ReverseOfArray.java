package Arrays;

public class ReverseOfArray {
    
    public static void main(String[] args) {

        //Initialize an Array
        int[] arr = {10, 20, 30, 40, 50};

        //Print Array Before Reversing
        System.out.print("Array before reversing : ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Reverse the Array Logic
        int b = 0;
        int e = arr.length - 1;
        int temp;

        while(b < e) {
            temp = arr[b];
            arr[b] = arr[e];
            arr[e] = temp;

            b++;
            e--;
        }

        //Print the Array after Reversing
        System.out.print("Array after reversing : ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
    }

}

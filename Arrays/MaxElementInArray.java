package Arrays;

public class MaxElementInArray {
    
    public static void main(String[] args) {


        //Initialize an array
        int[] arr = {10, 40, 20, 60, 100, 30, 80};

        //Initialize max as minimum Integer
        int max = Integer.MIN_VALUE;

        //Iterate loop and get max value
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        //Print the Maximum Element
        System.out.println("The maximum element in the Array is " + max);

    }

}

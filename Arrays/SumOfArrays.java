package Arrays;

public class SumOfArrays {

    public static void main(String[] args) {

        //Initialize an Array
        int[] arr = {10, 20, 30, 40, 50};

        //Initialize sum as 0
        int sum = 0;

        //Add all numbers to the sum
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        //Print the Sum
        System.out.println("The Sum of all elements in Array is " + sum);

    } 
    
}

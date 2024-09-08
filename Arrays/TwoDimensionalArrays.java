package Arrays;

public class TwoDimensionalArrays {
    
    public static void main(String[] args) {


        //Initiaze 2D Array with Empty Values
        // int[][] arr = new int[5][6]; //int[rows][columns]

        int[][] arr = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}
                    };

        //Print the Two Dimensional Array
        System.out.println("The Two Dimensional Array is : ");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Access Particular Element
        System.out.println("Before Changing The 2nd Element in 2nd row is " + arr[1][1]);

        //Change one element in Array
        arr[1][1] = 0;
        
        //Print the changed element
        System.out.println("After Changing The 2nd Element in 2nd row is " + arr[1][1]);

        //Get the length
        System.out.println("The Array having " + arr.length + " rows and " + arr[0].length + " columns");


    }

}

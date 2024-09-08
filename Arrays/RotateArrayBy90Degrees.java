package Arrays;

public class RotateArrayBy90Degrees {
    
    public static void main(String[] args) {

        int[][] arr = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}
                    };
        
        //Rotate Array 90 Degrees means Transpose the matrix and then reverse every row

        System.out.println("Matrix before Rotating : ");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Transpose the matrix
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<arr.length; i++) {
            int al = arr[i].length-1;
            for(int j=0; j<al/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][al-j];
                arr[i][al-j] = temp;
            }
        }

        System.out.println("Matrix after Rotating by 90 Degrees : ");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

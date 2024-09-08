package Arrays;

public class SubArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        //Print SubArrys 
        for(int s=0; s<arr.length; s++) {
            for(int e=s+1; e<=arr.length; e++) {
                for(int ele=s; ele<e; ele++) {
                    System.out.print(arr[ele] + " ");
                }
                System.out.println();
            }
        }
    }
    
}

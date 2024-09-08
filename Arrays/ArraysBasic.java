package Arrays;

class ArrayBasic {

    public static void main(String[] args) {

        //Initialize a array
        int arr[] = {1, 2, 3, 4, 5};

        //Access Element
        System.out.println("Second Element in Array is " + arr[1]);

        //Change Element
        arr[2] = 10;
        System.out.println("After Changing an element, the third element is " + arr[2]);

        //Length of the Array
        System.out.println("The Length of the Array is " + arr.length);

        //Print the Entire Array
        System.out.print("The Elements in the Array is : ");
        for(int i=0; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
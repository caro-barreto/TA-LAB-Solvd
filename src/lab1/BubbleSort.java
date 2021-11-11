package lab1;

public class BubbleSort {

    //Bubble sort compares pairs of adjacent elements and swap them into the correct order
    static void bubbleSort(int[]arr) {
        //it would take arr.length - 1 times
        //i = counts the number of times
        //each time checks the adjacent elements from the first until arr.length-1
        //if adjacent elements are not in order they get swapped.
        int i, j, aux;
        for(i=0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length - i - 1; j++){
                if (arr[j+1] < arr[j]) {
                    aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {3, 7, 6, 13, 33, 9, -100, 25};
        System.out.println("Array before sorting");
        for (int i:arr2) {
            System.out.print(i+" ");

        }
        System.out.println();
        bubbleSort(arr2);
        System.out.println("After sorting");
        for(int i:arr2) {
            System.out.print(i + " ");
        }
    }
}


package com.solvd.Homework.BubbleSortRecursion;
import java.util.Arrays;

public class BubbleSortRecursion {
    static void bubbleSortRecursion(int arr[], int n)
    {        if (n == 1)
            return;
        // first pass of bubble sort. Moves the largest element to the end
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        bubbleSortRecursion(arr, n-1);
    }

    public static void main(String[] args)
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
    // we use the lenght of the array as n. The function will call itself arr.lenght times.

        bubbleSortRecursion(arr, arr.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }
}
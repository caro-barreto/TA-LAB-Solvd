package Task3.copy;

public class SelectionSort {
	
	
	public static void selectionSort(int[]arr) {
		for(int i=0; i< arr.length -1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j]< arr[index]) {
					index = j; // This will find the lowest value
								}
			}
			int lowestValue = arr[index];
			arr[index] = arr[i];
			arr[i] = lowestValue;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {3, 7, 6, 13, 33, 9, -100, 25};
		System.out.println("Array before sorting");
		for (int i:arr1) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		selectionSort(arr1);
		System.out.println("After sorting");
		for(int i:arr1) {
			System.out.print(i + " ");
		}
	}

}

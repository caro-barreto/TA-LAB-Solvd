package Task2;

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello group!");
		
		/* You have array of numbers [3, 7, 6, 13, 33, 9, -100, 25]
Print all the values of array using while loop.
In the same loop find the biggest and the smallest value of an array and then print values afterwards.
*/
		
		int[] nums = {3, 7, 6, 13, 33, 9, -100, 25};
		int i = 0;
		while (i < nums.length) {
			System.out.println(nums[i]);
				i++;
				}
		int biggest = nums[0];
		int smallest = nums[0];
			for (int x= 1; x < nums.length; x++) {
				if (nums[x] > biggest) {
					biggest = nums[x];
				}
				else if (nums[x]< smallest) {
					smallest = nums[x];				
				}	
	
					}
			System.out.println("The biggest number is "+ biggest);		
			System.out.println("The smallest number is " + smallest);	
		}
}
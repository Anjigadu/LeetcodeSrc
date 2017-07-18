package leetcode.array.com;


/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.

	Do not allocate extra space for another array, you must do this in place with constant memory.
	For example,
	Given input array nums = [1,1,2],
	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
	It doesn't matter what you leave beyond the new length.
 */

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
        
		int i = nums.length > 0 ? 1 : 0;
	    for (int n : nums)
	        if (n > nums[i-1])
	            nums[i++] = n;
	    
	    for(int j = 0; j< nums.length ; j++)
		 {
			 System.out.println(nums[j]);
		 }
	    
	    return i;
    }
	
	
	/*
	 *   Throws an exception if values are not in the range of 0-1000
	 */
	
	
	public static int[] removeDuplicatesInGivenRange(int[] arr) {
	    boolean[] set = new boolean[1001]; //values must default to false
	    int totalItems = 0;

	    for (int i = 0; i < arr.length; ++i) {
	        if (!set[arr[i]]) {
	            set[arr[i]] = true;
	            totalItems++;
	        }
	    }

	    int[] ret = new int[totalItems];
	    int c = 0;
	    for (int i = 0; i < set.length; ++i) {
	        if (set[i]) {
	            ret[c++] = i;
	        }
	    }
	    return ret;
	}
	
	
	public static void main(String []args)
	{
		int [] array = {1,1,2};
		int  result = removeDuplicates(array);
		System.out.println("Main " + result);
		
	}
}

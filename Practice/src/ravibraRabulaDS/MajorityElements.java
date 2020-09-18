package ravibraRabulaDS;

import java.util.Arrays;

//Find a majority element in an array of size 'n'

public class MajorityElements {
	
//	Brute force
	public static int majorityElement(int[] a) {
		int majorityCount = a.length/2;

        for (int num : a) {
            int count = 0;
            for (int elem : a) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
	}
//	Sorting
	 public static int majorityElements(int[] nums) {
	        Arrays.sort(nums);
	        return nums[nums.length/2];
	    }

	public static void main(String[] args) {
		int[] a= {-1,5,5,5,5,4};
		System.out.println(majorityElement(a));
		System.out.println(majorityElements(a));
	}

}

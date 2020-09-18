package LeetCodeChallenge;
//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.

public class MajorityElements {
	public static void majorityElements(int[] nums) {
		int len=nums.length;
		int limit=(int) Math.floor(len/2);
		int count=0;
		int i;
		for(i=0;i<len;i++) {
			int j=i;
			while(j<len) {
				if(nums[i]==nums[j]) {
					count++;
					
				}
				j++;
			}
			if(count>limit) {
				System.out.println(nums[i]);
			}
			count=0;
		}
	}

	public static void main(String[] args) {
		int[] a= {2,2,1,1,1,2,2};
		majorityElements(a);

	}

}

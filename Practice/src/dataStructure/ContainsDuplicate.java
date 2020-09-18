package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) 
	{
		int j=1,i;
		for(i=0;i<nums.length;i++) {
			if( nums.length>1 && nums[i]==nums[i+j]) {
				return true;
			}
		}
		return false;
	}


	public boolean containDups(int[] nums) {
		HashSet<Integer> hash = new HashSet<>();
		for(Integer key:nums)
		{
			if(hash.contains(key))
			{
				return true;
			}
			else
			{
				hash.add(key);
			}
		}
		return false;
	}
	
	public int singleOne(int[] nums) {
		
		HashMap <Integer,Integer> h = new HashMap<>();
		Arrays.sort(nums);
		
		for(int i : nums) {
			if(h.containsKey(i)) {
				h.remove(i);
				
			}
			else 
				h.put(i, 0);
				
			
		}
		List<Integer> l = new ArrayList<>(h.keySet());
		return l.get(0);
		
	}
	public int singleNumber(int[] nums) {
		HashMap<Integer,Integer>hm = new HashMap<>();
		int i,count=0;
		Arrays.sort(nums);
		for( i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				count++;
				hm.put(nums[i], count);
			}
			else {
				count=0;
				hm.put(nums[i],++count);
			}
		}
		List<Integer> l= new ArrayList<>(hm.values());
		
		return l.get(1);
	}
	public static void main(String[] args) {
		int[] a= {1,2,1,2,3,4,5,6,7,8,8,7,3,4,5,1};
		ContainsDuplicate c= new ContainsDuplicate();
		System.out.println(c.containDups(a));
		System.out.println(c.singleOne(a));

	}

}

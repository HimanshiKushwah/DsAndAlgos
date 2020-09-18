import java.util.ArrayList;
import java.util.List;

public class RemoveDups {
	public int removeDuplicates(int[] nums) {
		
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(!(l.contains(nums[i]))) {
				l.add(nums[i]);	
			}
		}
		for(int i=0;i<l.size();i++) {
			nums[i]=l.get(i);
		}
		
		int size=l.size();
		return size;
	}
	
	public void show(List l) {
		for(int i=0;i<l.size();i++) {
			System.out.println();
			System.out.print(l.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		RemoveDups r = new RemoveDups();
		int[] nums= {1,1,2};
		
		System.out.print("Size of the list "+r.removeDuplicates(nums));
	}

}

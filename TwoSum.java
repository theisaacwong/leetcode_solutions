package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum implements Solution{


	public int[] input_1 = new int[] {1,2,3,4,5,6,7,8};
	public int input_2 = 10;
	
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> my_map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			
			int diff = target - nums[i];
			
			if(my_map.containsKey(diff)) {
				return(new int[] {i, my_map.get(diff)});
			} else {
				my_map.put(nums[i], i);
			}
		}
		return null;
		
		
		
	}
	
	public void run() {
		System.out.println(Arrays.toString(twoSum(input_1, input_2)));
	}



	
	
}

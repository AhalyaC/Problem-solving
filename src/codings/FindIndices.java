package codings;

import java.util.HashMap;
import java.util.Iterator;

//BrouteForce approach
public class FindIndices {

//	public static int[] findIndeces(int[] nums,int target) {
//		
//		for(int i=0;i<nums.length;i++) {
//			for(int j=0;j<nums.length;j++){
//				
//				
//				if(nums[j] == target-nums[i]) {
//					System.out.println(i + "," +j);
//					return new int[] {i,j};
//					
//				}
//			    }
//			}
//		
//		throw new IllegalArgumentException();
//	}
	
	//HashMap approach
	
	public static int[] findIndeces(int[] nums,int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		
		for(int i= 0;i<nums.length;i++) {
			int numToFind = target - nums[i];
			if(map.containsKey(numToFind) && map.get(numToFind) !=i) {
				System.out.println(i + "," +map.get(numToFind));
				return new int[] {i,map.get(numToFind)};
			}
		}
		throw new IllegalArgumentException();
		
		
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,4,6};
		int target = 8; 
		 findIndeces(n,target);
		 
		
		
	}
	
}

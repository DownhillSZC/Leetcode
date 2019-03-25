
public class Solution {
	 public static int[] searchRange(int[] nums, int target) {
	     return getRange(nums, target, 0, nums.length-1);
	 }
	 
	 public static int[] getRange(int[] nums, int target, int i, int j){
		 if(i==j && target==nums[i]){return new int[]{i, j};}
		 if(nums.length==0){return new int[]{-1, -1};}
		 int mid = (i+j)/2;
		 if(nums[mid] > target && j-i>1)
			 return getRange(nums, target, i, mid);
		 else if(nums[mid] < target && j-i>1)
			 return getRange(nums, target, mid, j);
		 else{
			 int[] result = {-1, -1};
			 while(i<nums.length || j>=0){
				 if(i<nums.length && nums[i]==target && result[0]==-1)
					 result[0] = i;
				 if(j>=0 && nums[j]==target && result[1]==-1)
					 result[1] = j;
				 i++;
				 j--;
			 }
			 return result;
		 }
	 }
	 
	 public static void main(String args[]){
		 int[] nums = {5, 7, 7, 8, 8, 10};
		 for(int i=0; i<searchRange(nums, 6).length; i++)
			 System.out.println(searchRange(nums, 6)[i]);
	 }
}



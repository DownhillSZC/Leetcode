/*
		思路：dynamic programming  imax:以nums[i-1]结尾的最大乘积
		                          imin:以nums[i-1]结尾的最小乘积 
		                          result:已经遍历过部分保留的最大值 
		    result = max{result, imax}
*/ 
public class Solution {
	public static int maxProduct(int[] nums) {
		int result = Integer.MIN_VALUE;
		int imax = 1, imin = 1;
		//如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
        for(int i=0; i<nums.length; i++){
        	if(nums[i]<0){
        		int temp = imax;
        		imax = imin;
        		imin = temp;
        	}
        	imax = Math.max(nums[i]*imax, nums[i]);
        	imin = Math.min(nums[i]*imin, nums[i]);
        	
        	result = Math.max(imax, result);
        }
        return result;
    }

	public static void main(String args[]){
		int[] nums = new int[]{2,0,-2};
		System.out.println(maxProduct(nums));
	}
}

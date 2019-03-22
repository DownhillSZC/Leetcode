
/*
 * my solution
 * **复杂度分析**
	时间复杂度：O(n)， 假设数组总共有 n个元素，i 和 j 至少遍历 2n 步。

	空间复杂度：O(1) 
 */
public class Solution {
	public static int removeElement(int[] nums, int val) {
		int index = 0;
		
		for(int i=0; i<nums.length; i++){
			if(nums[i] != val){
				nums[index] = nums[i];
				index++;
				//check = false;
			}
		}
		
		return index;
    }
	
	//删除元素少时效率更高
//	public static int removeElement(int[] nums, int val) {
//	    int i = 0;
//	    int n = nums.length;
//	    while (i < n) {
//	        if (nums[i] == val) {
//	            nums[i] = nums[n - 1];
//	            // reduce array size by one
//	            n--;
//	        } else {
//	            i++;
//	        }
//	    }
//	    return n;
//	}
	
	public static void main(String args[]){
		int[] nums = {2, 2};
//		for(int i=0; i<nums.length; i++){
//			System.out.println(nums[i]);
//		}
		System.out.println(removeElement(nums, 2));
	}
	

}

import java.util.Arrays;

public class Solution {
//	public static void nextPermutation(int[] nums) {
//        int i = nums.length-1; 
//        boolean find = false;
//        while(i>0){
//            if(nums[i-1] < nums[i]){
//                find = true;
//                i--;
//                break;
//            }
//            i--;
//        }
//        
//        if(find==false){
//            int a = 0;
//            int b = nums.length-1;
//            while(a<b){
//                swap(nums, a, b);
//                a++;
//                b--;
//            }
//        }
//        else{
//        	//此处冗余，因为遍历过得数组已经是按顺序从大到小排序，寻找交换位置无需遍历后边所有元素
//            int index = -1;
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[j] > nums[i]){
//                    if(index == -1)
//                        index = j;
//                    else if(nums[j] < nums[index])
//                        index = j;
//                }
//            }
//            swap(nums, i, index);
//            Arrays.sort(nums, i+1, nums.length);
//        	
//        }
//	}
//    
//    public static void swap(int[] nums, int i, int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
	
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
    
    public static void main(String args[]){
    	int[] nums = {5, 4, 7, 5, 3, 2};
    	nextPermutation(nums);
    	for(int i=0; i<nums.length; i++)
    		System.out.println(nums[i]);
    }
}

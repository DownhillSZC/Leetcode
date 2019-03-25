import java.util.HashMap;
import java.util.Set;

public class Solution {
	public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0, result = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
        	if(map.containsKey(nums[i])){
        		int temp = map.get(nums[i])+1;
        		map.put(nums[i], temp);
        		maxCount = Math.max(maxCount, temp);
        	}
        	else{
        		map.put(nums[i], 1);
        		maxCount = Math.max(maxCount, 1);
        	}
        }
        
        if(maxCount == 1)
        	return 1;
        
        Set<Integer> set = map.keySet();
        for(int n : set){
        	if(map.get(n) == maxCount){
        		int i = 0, j = nums.length-1;
        		int[] result1 =  new int[]{-1,-1};
				while(i<nums.length || j>=0){
					 if(i<nums.length && nums[i]==n && result1[0]==-1)
						 result1[0] = i;
					 if(j>=0 && nums[j]==n && result1[1]==-1)
						 result1[1] = j;
					 i++;
					 j--;
				 }
				int range = result1[1]-result1[0]+1;
        		result = Math.min(result, range);
        	}
        }
        return result;        
    }
	
	//空间换速度。。膜拜 不过如果极差过大并不适用
//	public int findShortestSubArray(int[] nums) {
//        //求出nums数组中的最大的数
//		int maxNum = nums[0];
//		for(int i= 1; i<nums.length;i++) {
//			maxNum = Math.max(maxNum, nums[i]);
//		}
//		//用三个数组分别记录：起始位置，长度，度
//		int max = 1; //最大的度
//		int[] start = new int[maxNum + 1];//起始位置
//		int[] length =  new int[maxNum + 1];//长度
//		int[] count = new int[maxNum + 1];//度
//		for(int i = 0;i<nums.length;i++) {
//			count[nums[i]]++;
//			if(count[nums[i]] == 1) {
//				//记录第一处出现的位置
//				start[nums[i]] =i;
//				
//			}else {
//				length[nums[i]] = i - start[nums[i]]+1;//记录当前的长度
//				max = Math.max(count[nums[i]], max);//z最大的度
//				
//			}
//		}
//		if(max == 1) {
//			return 1;
//		}
//		int degree = nums.length;//最大的度对应的最小的数组长度
//		for(int i = 0; i<= maxNum;i++) {
//			if(count[i] == max) {
//				degree = Math.min(length[i], degree);
//			}
//		}
//		return degree;
//    }
	
	public static void main(String args[]){
		int[] nums = new int[]{1};
		System.out.println(findShortestSubArray(nums));
	}
	 
}

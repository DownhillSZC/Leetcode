
public class Solution {
	public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 0;
        for(int i=0; i<nums.length; i++){
        	imax = Math.max(imax+nums[i], nums[i]);
        	max = Math.max(imax, max);
        }
        return max;
    }
	
	/*
	 * 下面是一个时间复杂度更小(O(N))的算法: (只限于含正数的序列，有局限性)

该算法更为简便之处是忽略了对子序列的寻找比较,而是根据规律直接找出最佳答案.

对于含有正数的序列而言,最大子序列肯定是正数,所以头尾肯定都是正数.我们可以从第一个正数开始算起,
每往后加一个数便更新一次和的最大值;当当前和成为负数时,则表明此前序列无法为后面提供最大子序列和,因此必须重新确定序列首项.
	 */
//	public static int maxSubArray(int[] nums){
//		int max = 0,  imax = 0;
//		for(int i=0; i<nums.length; i++){
//			imax += nums[i];
//			if(imax > max)
//				max = imax;
//			else if(imax<0)
//				imax = 0;
//		}
//		return max;
//	}
//	
	public static void main(String args[]){
		int[] nums = new int[]{-2,-1};
		System.out.println(maxSubArray(nums));
	}
}

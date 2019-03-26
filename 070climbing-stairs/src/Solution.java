
public class Solution {
	//动态规划 到i层需要前i-1层加一步或者i-2层加2步（斐波那契数）
	public static int climbStairs(int n) {
		if(n==1){return 1;}
		int[] array = new int[n];
		array[0] = 1; 
		array[1] = 2;
        for(int i=2; i<n; i++){
        		array[i] = array[i-2] + array[i-1];
        }
        return array[n-1];
    }
	
	public static void main(String args[]){
		System.out.println(climbStairs(3));
	}
}


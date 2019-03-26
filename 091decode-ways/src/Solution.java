//此题太垃圾了。。。动态规划算法本身不难，重点在于边界检测，我佛了
public class Solution {
	public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        if(s.charAt(0)!='0') dp[1] = dp[0] = 1;
        for(int i = 2;i<=n;i++){
            if(s.charAt(i-1)=='0'){
                if(s.charAt(i-2)=='1' || s.charAt(i-2)=='2') 
                    dp[i] = dp[i-2];
                else
                    return 0;
            }
            else{
                dp[i] = dp[i-1];
                if(s.charAt(i-2)!='0'){
                    int t = 10*(s.charAt(i-2)-'0')+s.charAt(i-1)-'0';
                    if(t<=26)
                        dp[i] += dp[i-2];
                }
            }
        }
        return dp[n];
    }
//	public static int numDecodings(String s) {
//		if(s.length() == 0 || s.startsWith("0")){ return 0;}
//		int length = s.length();
//		if(length == 1) return 1;
//        int[] dp = new int[length];
//        dp[0] = 1;
//        dp[1] = (Integer.valueOf(s.substring(0, 2)) <= 26 && !s.contains("0")) ? 2 : 1;
//        for(int i=2; i<length; i++){
//        	if(s.charAt(i)=='0'){
//                if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2') 
//                    dp[i] = dp[i-2];
//                else
//                    return 0;
//            }
//        	else{
//		    	if(Integer.valueOf(s.substring(i-1, i+1)) > 26 || s.substring(i-1, i+1).contains("0"))
//					dp[i] = dp[i-1];
//		    	else
//		    		dp[i] = dp[i-2] + dp[i-1];
//        	}
//        }
//        return dp[length-1];
//    }
	
	public static void main(String args[]){
		String s = "100";
		System.out.println(numDecodings(s));
	}
}

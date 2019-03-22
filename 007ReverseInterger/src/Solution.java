
public class Solution {
	public static int reverse(int x){
		int rev = 0;
		while(x!=0){
			//弹出最后一位
			int pop = x%10;
			x = x/10;
			
			//检查是否溢出 the 32-bit signed integer range: [−2-31,  2-31 − 1].
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)){
				return 0;
			}
			else if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop <-8)){
				return 0;
			}
			else{
				rev = rev*10 + pop;
			}
		}
		
		return rev;
	}
	
	public static void main(String args[]){
		int x = 123;
		System.out.println(reverse(x));
	}

}

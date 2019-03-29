import java.util.*;
public class Solution {
	public static String getPermutation(int n, int k) {
        String result = "";
        if(n==1&&k==1) return "1";
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++)
            nums.add(i, i+1);
        int count = 1;
        while (result.length() < n){
        	 int temp = (int) ((k-1)/factorial(n-count));
             result += nums.get(temp);
             nums.remove(temp);
             k = k-factorial(n-count)*temp;//此处取余%更好
             count++;
        }
        return result;
    }
	
	 public static int factorial(int number) {
	        if (number <= 1)
	            return 1;
	        else
	            return number * factorial(number - 1);
	 }
    
    public static void main(String args[]){
    	System.out.println(getPermutation(3, 3));
    }
}

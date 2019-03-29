import java.util.*;
class Solution {
//    public static String countAndSay(int n) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        int count = 1;
//        while(count < n){
//        	 ArrayList<Integer> temp = new ArrayList<>();
//        	 int k = 0;
//        	 for(int i=0; i<nums.size(); i++){
//        		 if( i+1<nums.size() && nums.get(i+1) == nums.get(i))
//        			 k++;
//        		 else{
//        			 temp.add(k+1);
//        			 temp.add(nums.get(i));
//        			 k = 0;
//        		 }
//        	 }
//        	 nums = temp;
//             count++;
//        }
//        String result = "";
//        for(int i : nums)
//            result += i;
//        return result;
//    }
	
	public static String countAndSay(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return "1";
        }
        String preData = countAndSay(n - 1);

        char[] arr = preData.toCharArray();

        char preChar = arr[0];
        int charCount = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == preChar) {
                charCount++;
            } else {
                sb.append(charCount).append(preChar);
                preChar = arr[i];
                charCount = 1;
            }
        }
        sb.append(charCount).append(preChar);

        return sb.toString();
    }
    
    public static void main(String args[]){
    	System.out.println(countAndSay(7));
    }
}
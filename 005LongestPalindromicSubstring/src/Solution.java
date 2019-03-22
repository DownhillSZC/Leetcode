
public class Solution {
	//学到了，中心扩展法动态规划
    public static String longestPalindrome(String s) {
    	if(s.length()==0 && s.length()==1)
    		return "";
    	int start = 0, end = 0;
    	for(int i=0; i<s.length(); i++){
    		int t1, t2;
    		int len1 = expand(s, i, i) + 1;
    		int len2 = expand(s, i, i+1) + 1;
    		if(len1 > len2){
    			t1 = i - len1/2;
    			t2 = i + len1/2;
    		}
    		else{
    			t1 = i + 1 - len2/2;
    			t2 = i  + len2/2;
    		}
    		if((t2-t1) > (end-start)){
    			end = t2;
    			start = t1;
    		}
    	}
    	
    	if(end == start){return "";}
    	else{return s.substring(start, end+1);}
    }
    
    public static int expand(String s, int i, int j){
        char[] arr = s.toCharArray();
        int left = i, right = j;
        while(left>=0 && right<arr.length){
        	if(arr[left] == arr[right]){
        		left--;
        		right++;
        	}
        	else{
        		break;
        	}
        }
        return (right-1)-(left+1);
    }
    
    public static void main(String args[]){
    	String s = "abc";
    	System.out.println(longestPalindrome(s));
    }
}

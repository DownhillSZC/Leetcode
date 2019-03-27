/*
 * KMP
 * https://www.cnblogs.com/zhangtianq/p/5839909.html
 */
public class Solution {
	public static int[] getNext(String s){
		int[] next = new int[s.length()];
		int k = -1, i = 0;
		next[0] = -1;
		while(i<s.length()-1){
			if(k==-1 || s.charAt(i)==s.charAt(k)){
				i++;
				k++;
				next[i] = k;
			}
			else
				k = next[k];
		}
		
			
		return next;
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.equals("")) return 0;
        int i = 0, j = 0;
        int[] next = getNext(needle);
        while(i<haystack.length() && j<needle.length()){
        	if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
        		i++;
        		j++;
        	}
        	else{
        		j = next[j];
        	}
        }
        if(j == needle.length())
        	return i-j;
        else
        	return -1;
    }
	
//	public static int strStr(String haystack, String needle){
//		return haystack.indexOf(needle);
//	}
	
	public static void main (String args[]){
		String s = "abab";
		int[] next = getNext(s);
		for(int i=0; i<next.length; i++)
			System.out.println(next[i]);
	}
}

import java.util.*;

public class Solution {
	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if(digits.equals("")) return result;
        char[] array = digits.toCharArray();
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        combine(result, array, map, 0, "");
        return result;
    }
	
	public static void combine(List<String> result, char[] array, HashMap<String, String> map, int n, String temp){
		if(temp.length() == array.length){
			result.add(temp);
			return;
		}
		char[] list = map.get(String.valueOf(array[n])).toCharArray();
		for(int i=0; i<list.length; i++){
			temp += list[i];
			combine(result, array, map, n+1, temp);
			temp = temp.substring(0, temp.length()-1);
		}
	}
	
	public static void main(String args[]){
		String s = "23";
		List<String> result = letterCombinations(s);
		for(int i=0; i<result.size();i++)
			System.out.println(result.get(i));
	}
}

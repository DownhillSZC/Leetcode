
public class Solution {
	 public static String convert(String s, int numRows) {
           if(s.equals("")){return "";}
           if(numRows==1){return s;}
	       char[] array = s.toCharArray();
	       String[] results = new String[numRows];
	       boolean increase = true;
	       int index = 0;
	       
	       for(int i=0; i<numRows; i++){
	    	   results[i] = "";
	       }
	       
	       for(int i=0; i<s.length(); i++){
	    	   		results[index] += array[i];
	    	   		if(increase==true){
	    	   			index++;
	    	   			if(index==numRows-1)
	    	   				increase = false;
	    	   		}
	    	   		else{
	    	   			index--;
	    	   			if(index==0)
	    	   				increase = true;
	    	   		}
	       }
	       
	       String result = "";
	       for(int i=0; i<results.length; i++)
	    	   	result += results[i];
	       return result;
		 
	 }
	 
//	 public String convert(String s, int numRows) {
//
//	        if (numRows == 1) return s;
//
//	        List<StringBuilder> rows = new ArrayList<>();
//	        for (int i = 0; i < Math.min(numRows, s.length()); i++)
//	            rows.add(new StringBuilder());
//
//	        int curRow = 0;
//	        boolean goingDown = false;
//
//	        //这么写思路更清晰，代码更简洁
//	        for (char c : s.toCharArray()) {
//	            rows.get(curRow).append(c);
//	            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
//	            curRow += goingDown ? 1 : -1;
//	        }
//
//	        StringBuilder ret = new StringBuilder();
//	        for (StringBuilder row : rows) ret.append(row);
//	        return ret.toString();
//	    }
	 
	 public static void main(String args[]){
		 String s = "AB";
		 System.out.println(convert(s, 1));
	 }
}

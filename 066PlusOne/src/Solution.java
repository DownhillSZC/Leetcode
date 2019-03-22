
public class Solution {
	public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        if(digits[index] != 9){
            digits[index] += 1;
        }
        else{
            while(true){
                digits[index] = 0;
                index--;
                if(index < 0){
                	int[] num = new int[digits.length+1];
                    num[0] = 1;
                    return num;
                }

                if(digits[index] != 9){
                    digits[index]++;  
                    break;
                } 
            }
        }
        
        return digits;
    }
	
	public static void main(String args[]){
		int[] num = {1, 2, 9, 9};
		int[] num1 = plusOne(num);
		for(int i=0; i<num1.length; i++)
			System.out.println(num1[i]);
	}
}

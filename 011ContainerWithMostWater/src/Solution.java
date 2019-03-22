
public class Solution {
	public int maxArea(int[] height) {
        int maxarea = 0;
        int s1 = 0, s2 = height.length-1;
        while(s2-s1>0){
            maxarea = Math.max(maxarea, Math.min(height[s1], height[s2])*(s2-s1));
            if(height[s1] > height[s2]){s2--;}
            else{s1++;}
        }
        return maxarea;
    }
}


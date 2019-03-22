package com.company;

import java.util.HashMap;
import java.util.Map;

class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                int temp = 0;
//                temp = nums[i] + nums[j];
//                if( temp == target){
//                    result[0] = i;
//                    result[1] = j;
//                    break;
//                }
//
//            }
//        }
//
//        return result;
//    }

//    /**
//     * Two-pass Hash Table
//     * @param nums
//     * @param target
//     * @return
//     */
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    /**
     * One-pass Hash Table
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
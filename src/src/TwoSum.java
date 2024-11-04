// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9 Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6 Output: [1,2]
// Example 3:
// Input: nums = [3,3], target = 6 Output: [0,1]


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args){

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));  // Output: [0,1]
        System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));      // Output: [1,2]
        System.out.println(Arrays.toString(twoSum(new int[] {3,3}, 6)));        // Output: [0,1]
        System.out.println(Arrays.toString(twoSumOptimized(new int[] {2,7,11,15}, 9))); // Output: [0,1]
        System.out.println(Arrays.toString(twoSumOptimized(new int[] {3,2,4},6)));  // Output: [1,2]
        System.out.println(Arrays.toString(twoSumOptimized(new int[] {3,3}, 6)));   // Output: [0,1]

    }

    // First we do the Brute Force method
    // In this method we use two for loops, to iterate through the array nums.
    // The first for loop will start from index 0, and then enter the next for loop from index 1, and check if the element at index 0
    // plus the element at index 1 equal the target value, if equal, the indices are returned. if not, then j loop iterates to the next
    // index and so on till te whole array is iterated or a match is found.
    private static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){               // we start the first for loop, which holds one element and then checks the sum with every other element.
            for(int j = 1; j < nums.length; j++){           // this iterates through the array starting from index 1, as we cannot use the same element twice.
                if(nums[i] + nums[j] == target){            // this condition will check if the elements at both indices add up to the target.
                    return new int[] {i,j};                 // if they add up to the target, then we return a new integer array with the indeices.
                }
            }
        }
        throw new IllegalArgumentException("Match not found");      // if the array is fully iterated and we dont find a match
    }
    // the time complexity for the brute force method is O(n^2) because the worst case possible is that we iterate through both the loops to find the match at the end.


    // This is the optimized version of the Two sum problem
    // in this we use the concept of HashMap which reduces the time complexity from O(n^2) to O(n)
    private static int[] twoSumOptimized(int[] nums, int target){
        HashMap<Integer, Integer> numsMap = new HashMap<>();    // We create a HashMap
        for(int i = 0; i < nums.length; i++){                   // We iterate through the array one element at a time
            int complement = target - nums[i];                  // then we calculate the complement which is given by the formula.
            if(numsMap.containsKey(complement)){                // then we check the condition if the HashMap contains the complement key in it.
                return new int[] {numsMap.get(complement),i};   // if it contains the key in the HashMap, then we return a new integer array with the complements index and the index i
            }
            numsMap.put(nums[i],i);                             // if not found then we simple add the key,value pair to the HashMap
        }
        throw new IllegalArgumentException("Match not found");     // If a match is not found
    }
    // The time complexity for the optimized version is O(n).
}
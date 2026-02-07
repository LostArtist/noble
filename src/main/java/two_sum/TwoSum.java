package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] a = {3,4,5,2,2,7};
        int target = 8;
        System.out.println(Arrays.toString(twoSum3(a, target)));
    }

    // Approach 1  ::  Brute force  ::  Time Complexity O(n^2)

    public static int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return new int[] {0, 0};
        };

        for(int i = 0; i<nums.length; i++) {
            for (int j = 0; j<nums.length; j++){
                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    // Approach 2  ::  HashMap  ::  Time Complexity O(n), lookup cycle ~ O(1)

    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {     // add values as a key and indices as index
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];     // calculate complement for each number
            if (map.containsKey(complement) && map.get(complement) != i) { // find complements in the hashmap and return it if indices are different
                return new int[] { i, map.get(complement) };
            }
        }
        return new int[] {};
    }

    // Approach 3 :: One-Pass HashMap :: Time Complexity O(n)

    public static int[] twoSum3(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // merge putting values to the map and finding complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

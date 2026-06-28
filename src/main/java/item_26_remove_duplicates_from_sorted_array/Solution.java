package remove_duplicates;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int removeDuplicates(int[] nums) {
//        Set<Integer> st = new HashSet<>();
//        int k = 0;
//        for (int i : nums) {
//            if(!st.contains(i)) {
//                k++;
//            }
//            st.add(i);
//        }
//        System.out.println(st);
//        return k;

        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}

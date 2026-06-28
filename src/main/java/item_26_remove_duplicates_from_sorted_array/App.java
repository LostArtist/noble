package remove_duplicates;

import remove_duplicates.Solution;

class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {1,1,2};
        System.out.println(solution.removeDuplicates(nums2));
    }
}

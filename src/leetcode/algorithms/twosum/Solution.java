package leetcode.algorithms.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] ret = new int[2];
        for (i = 0; i < nums.length - 1; ++i) {
            for (j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    return ret;
                }
            }
        }

        return ret;
    }

    public int[] twoSum2(int[] nums, int target) {
        int i, j;
        int[] ret = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < nums.length; ++i) {
            map.put(num[i], i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] { 0, 4, 3, 0 };
        int target = 0;
        int[] ret = solution.twoSum(nums, target);
        System.out.println(ret[0] + ", " + ret[1]);
    }
}

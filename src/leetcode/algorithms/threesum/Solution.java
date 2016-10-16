package leetcode.algorithms.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by 怀 on 2016/10/16.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int len = nums.length;
        if(len < 3) {
            return ret;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; ++i) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i] > 0) {
                break;
            }
            int j = i + 1, k = len - 1;

            while(j < k) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if(nums[i] + nums[j] > 0) {
                    break;
                }

                if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    ret.add(Stream.of(nums[i], nums[j], nums[k]).collect(Collectors.toList()));
                    j++;
                    k--;
                }
            }
        }

        return ret;
    }
}

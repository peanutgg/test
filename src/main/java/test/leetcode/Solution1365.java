package test.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/solution/you-duo-shao-xiao-yu-dang-qian-shu-zi-de-shu-zi--2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution1365 {
    public static void main(String[] args) {
        Integer[] nums = {8,1,2,2,3};
        System.out.println(11122);
        Arrays.asList(smallerNumbersThanCurrent(nums)).forEach(System.out::println);
    }


    public static Integer[] smallerNumbersThanCurrent(Integer[] nums) {
        int n = nums.length;
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = nums[i];
            data[i][1] = i;
        }
        Arrays.sort(data, new Comparator<int[]>() {
            public int compare(int[] data1, int[] data2) {
                return data1[0] - data2[0];
            }
        });
        Integer[] ret = new Integer[n];
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (prev == -1 || data[i][0] != data[i - 1][0]) {
                prev = i;
            }
            ret[data[i][1]] = prev;
        }
        return ret;
    }


}

package test.leetcode;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 */
class Solution {
    public static void main(String[] args) {

        String s = "qqzxxcv";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int a = c[i];
            boolean f = false;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j] && i != j) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                return i;
            }
            if (f && i == c.length - 1) {
                return -1;
            }

        }
        return 0;
    }
}
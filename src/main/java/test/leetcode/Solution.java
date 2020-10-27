package test.leetcode;

/**
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
 * <p>
 * ����:
 * <p>
 * s = "leetcode"
 * ���� 0.
 * <p>
 * s = "loveleetcode",
 * ���� 2.
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
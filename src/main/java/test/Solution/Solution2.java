package test.Solution;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
 * <p>
 * <p>
 * 注意:
 * <p>
 * 给定的整数保证在 32 位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 本题与 1009 https://leetcode-cn.com/problems/complement-of-base-10-integer/ 相同
 * <p>
 * java内置进制转换方法：
 * <p>
 * 转换为二进制：Integer.toBinaryString(int i)
 * <p>
 * 转换为八进制：Integer.toOctalString(int i)
 * <p>
 * 转换为十六进制：Integer.toHexString(int i) //
 * <p>
 * 二进制转换为十进制：Integer.valueOf("1011",2).toString()
 * 八进制转换为十进制：Integer.valueOf("157",8).toString()
 * <p>
 * 十六进制转换为十进制：Integer.valueOf("9A",16).toString()
 */
public class Solution2 {
    public static void main(String[] args) {

        Integer p = 1;
        String binaryS = Integer.toBinaryString(p);
        System.out.println(binaryS);
        char[] cs = binaryS.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '0') {
                sb.append("1");
            }
            if (cs[i] == '1') {
                sb.append("0");
            }
        }
        String bins = "";
        System.out.println(Integer.valueOf(sb.toString(), 2).toString());
    }


    public int findComplement(int num) {

        String binaryS = Integer.toBinaryString(num);
        char[] cs = binaryS.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '0') {
                sb.append("1");
            }
            if (cs[i] == '1') {
                sb.append("0");
            }
        }
        return Integer.valueOf(sb.toString(), 2);

    }
}

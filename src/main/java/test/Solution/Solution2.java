package test.Solution;

/**
 * ����һ����������������Ĳ����������ǶԸ����Ķ����Ʊ�ʾȡ����
 * <p>
 * <p>
 * <p>
 * ʾ�� 1:
 * <p>
 * ����: 5
 * ���: 2
 * ����: 5 �Ķ����Ʊ�ʾΪ 101��û��ǰ����λ�����䲹��Ϊ 010����������Ҫ��� 2 ��
 * ʾ�� 2:
 * <p>
 * ����: 1
 * ���: 0
 * ����: 1 �Ķ����Ʊ�ʾΪ 1��û��ǰ����λ�����䲹��Ϊ 0����������Ҫ��� 0 ��
 * <p>
 * <p>
 * ע��:
 * <p>
 * ������������֤�� 32 λ�����������ķ�Χ�ڡ�
 * ����Լٶ���������������ǰ����λ��
 * ������ 1009 https://leetcode-cn.com/problems/complement-of-base-10-integer/ ��ͬ
 * <p>
 * java���ý���ת��������
 * <p>
 * ת��Ϊ�����ƣ�Integer.toBinaryString(int i)
 * <p>
 * ת��Ϊ�˽��ƣ�Integer.toOctalString(int i)
 * <p>
 * ת��Ϊʮ�����ƣ�Integer.toHexString(int i) //
 * <p>
 * ������ת��Ϊʮ���ƣ�Integer.valueOf("1011",2).toString()
 * �˽���ת��Ϊʮ���ƣ�Integer.valueOf("157",8).toString()
 * <p>
 * ʮ������ת��Ϊʮ���ƣ�Integer.valueOf("9A",16).toString()
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

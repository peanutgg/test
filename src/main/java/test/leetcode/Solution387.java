package test.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution387 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        candy(arr);

//        System.out.println(firstUniqChar("llseetcode"));
    }

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> uniqueMap = new HashMap<>();

        for (char c : arr) {
            if (!uniqueMap.containsKey(c)) {
                uniqueMap.put(c, 1);
            } else {
                uniqueMap.put(c, 2);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (uniqueMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int candy(int[] ratings) {
        if(ratings == null){
            return 0;
        }
        if(ratings.length <= 1){
            return 0 + ratings.length;
        }
        int min = 0;
        int index = 0;
        for(int i =0 ; i < ratings.length-1; i++){
            min = ratings[i];
            if(ratings[i] > ratings[i+1]){
                min = ratings[i+1];
                index = i+1;
            }
        }
        final int[] total = new int[1];
        total [0] = 1;
        int minValue = ratings[index];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(index,1);
        for(int i = index ; i >= 1 ; i --){
            if(ratings[i-1]  > minValue){
                map.put(i-1,map.get(i)+1);
            }else{
                map.put(i-1,map.get(i) == 1 ? 1 : map.get(i) - 1);
            }
        }
        for(int i = index ; i < ratings.length-1 ; i ++){
            if(ratings[i+1]  > minValue){
                map.put(i+1,map.get(i)+1);
            }else{
                map.put(i+1,map.get(i) == 1 ? 1 : map.get(i) - 1);
            }
        }
        map.entrySet().stream().forEach(o-> {
            total[0] += o.getValue();
        });
        Arrays.toString(ratings);
        
        return total[0]-1;
    }

}

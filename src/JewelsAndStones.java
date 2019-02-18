import java.util.HashMap;

/**
 * @author Administrator
 * @date 2018/12/24
 */
public class JewelsAndStones {


    public static int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();

        HashMap<Character, Integer> stonesMap = new HashMap<>();
        for (char s : stones) {
            if (!stonesMap.containsKey(s)) {
                stonesMap.put(s, 1);
            } else {
                stonesMap.put(s, stonesMap.get(s) + 1);
            }
        }
        Integer sum = 0;
        for (char j : jewels) {
            Integer count = stonesMap.get(j);
            if (count != null) {
                sum += count;
            }
        }
        return sum;
    }

    public static int solution(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        char[] array = new char['z' + 1];
        for (char c : jewels) {
            array[c] = 1;
        }
        int sum = 0;
        for (char s : stones) {
            if (array[s] == 1) {
                sum++;
            }
        }
        return sum;
    }
}

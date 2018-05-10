/**
 * @author zxy
 * @date 2018/5/9
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aca", "cba"};
        System.out.println(longestCommonPrefix(strs));
        String[] strsb = {"123", "1234", "123456"};
        System.out.println(longestCommonPrefix(strsb));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String shortest = "";
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = strs[i].length();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int shortestLength = arr[arr.length - 1];
        for (String s : strs) {
            if (s.length() == shortestLength) {
                shortest = s;
                break;
            }
        }

        if (shortest.length() == 0) {
            return "";
        }
        String[] prefixes = new String[shortest.length()];
        char[] chars = shortest.toCharArray();
        int index = 0;
        String last = "";
        for (char c : chars) {
            last = last + String.valueOf(c);
            prefixes[index] = last;
            index++;
        }
        String prefix = "";
        for (int i = prefixes.length - 1; i >= 0; i--) {
            int count = 0;
            for (String s : strs) {
                if (s.startsWith(prefixes[i])) {
                    count++;
                }
            }

            if (count == strs.length) {
                prefix = prefixes[i];
                break;
            }
        }
        return prefix;
    }


}

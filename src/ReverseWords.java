/**
 * @author zxy
 * @date 2019/2/19
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] stringArray = s.split(" ");
        String reversWords = "";
        for (int i = 0; i < stringArray.length; i++) {
            String reverseSingle = reverseString(stringArray[i].toCharArray());
            if (i != stringArray.length - 1) {
                reverseSingle += " ";
            }
            reversWords += reverseSingle;
        }
        return reversWords;
    }

    public String reverseString(char[] s) {
        for (int i = 0; i < ((s.length % 2 == 0) ? s.length / 2 : s.length / 2 + 1); i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
        return new String(s);
    }

    public String solution(String s) {

    }
}

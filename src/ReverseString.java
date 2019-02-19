/**
 * @author zxy
 * @date 2019/2/19
 */
public class ReverseString {
    public static void solution(char[] s) {
        for (int i = 0; i < ((s.length % 2 == 0) ? s.length / 2 : s.length / 2 + 1); i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }
}

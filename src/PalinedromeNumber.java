import java.util.ArrayList;
import java.util.List;

/**
 * @author zxy
 * @date 2018/5/8
 */
public class PalinedromeNumber {
    public static void main(String[] args) {
        int x = 11011;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int m;
            List<Integer> l = new ArrayList();
            int temp = x;
            while (temp > 0) {
                m = temp % 10;
                temp = (temp - m) / 10;
                l.add(m);
            }
            int size = l.size() - 1;
            int y = 0;
            for (int e : l) {
                y = y + e * (int) (Math.pow(10, size));
                size--;
            }
            return x == y;
        }
    }
}

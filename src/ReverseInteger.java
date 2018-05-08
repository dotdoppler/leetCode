/**
 * @author zxy
 * @date 2018/5/8
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 2147483641;
        System.out.println(reverseWithChar(x));
        System.out.println(reverse(x));
    }

    public static int reverseWithChar(int x) {
        int flag = 1;
        int y = x;
        if (x < 0) {
            flag = -1;
        }

        char[] chars = String.valueOf(y).replaceAll("-", "").toCharArray();
        char[] reverseChars = new char[chars.length];
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
            reverseChars[i] = chars[j];
        }

        if (reverseChars[0] != '0') {
            int index = -1;
            for (int i = 0; i < reverseChars.length; i++) {
                if (reverseChars[i] == '0') {
                    index++;
                }
                if (index != i) {
                    break;
                }
            }
        }
        long res = Long.valueOf(new String(reverseChars));
        if (res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return Integer.valueOf(new String(reverseChars)) * flag;
        }
    }

    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Long y = 0L;
        while (x != 0) {
            y= y * 10 + x % 10;
            x /= 10;
        }
        if (y > max || y < min) {
            return 0;
        } else {
            return y.intValue();
        }
    }
}

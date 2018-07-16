import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zxy
 * @date 2018/7/16
 */
public class KeyboardRow {

    public static String[] findWords(String[] words) {
        if (words == null || words.length == 0) {
            return new String[0];
        }
        String[] firstRow = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
        String[] secondRow = new String[]{"a", "s", "d", "f", "g", "h", "j", "k", "l"};
        String[] thirdRow = new String[]{"z", "x", "c", "v", "b", "n", "m"};

        List<String> list = new ArrayList();
        HashMap firstRowMap = new HashMap();
        HashMap secondRowMap = new HashMap();
        HashMap thirdRowMap = new HashMap();
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                String lower = String.valueOf(c).toLowerCase();
                for (String s : firstRow) {
                    if (s.equals(lower)) {
                        firstRowMap.put(c, 1);
                        break;
                    }
                }
                for (String s : secondRow) {
                    if (s.equals(lower)) {
                        secondRowMap.put(c, 1);
                        break;
                    }
                }
                for (String s : thirdRow) {
                    if (s.equals(lower)) {
                        thirdRowMap.put(c, 1);
                        break;
                    }
                }
            }
            if (!firstRowMap.isEmpty() && secondRowMap.isEmpty() && thirdRowMap.isEmpty()) {
                list.add(word);
            }
            if (firstRowMap.isEmpty() && !secondRowMap.isEmpty() && thirdRowMap.isEmpty()) {
                list.add(word);
            }
            if (firstRowMap.isEmpty() && secondRowMap.isEmpty() && !thirdRowMap.isEmpty()) {
                list.add(word);
            }
            firstRowMap.clear();
            secondRowMap.clear();
            thirdRowMap.clear();
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] words = findWords(new String[]{"ppp"});
        for (String w : words) {
            System.out.println(w);
        }
    }
}

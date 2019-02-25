/**
 * @author zxy
 * @date 2019/2/25
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }
}

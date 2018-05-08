import java.util.ArrayList;

/**
 * @author zxy
 * @date 2018/5/8
 */
public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 15, 11, 7};
        int target = 9;
        int[] res = twoSum(nums, target);
        for (int e : res) {
            System.out.println(e);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    res[0] = i;
                    res[1] = k;
                }
            }
        }
        return res;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * 拥有最多糖果的孩子
 */
public class Q1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> res = new ArrayList<>(len);

        int max = candies[0];
        for (int i = 1; i < len; i++) {
           if (max < candies[i]) {
               max  = candies[i];
           }
        }

        for (int num : candies) {
            res.add(num + extraCandies >= max);
        }

        return res;
    }
}

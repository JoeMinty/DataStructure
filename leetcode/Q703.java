import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q703 {

    private List<Integer> numList = new ArrayList<>();

    private int k;

    public Q703(int k, int[] nums) {
        for (int num : nums) {
            numList.add(num);
        }
        this.k = k;
    }

    public int add(int val) {
        numList.add(val);
        Collections.sort(numList);
        return numList.get(numList.size() - k);
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        Q703 q703 = new Q703(3, nums);
        System.out.println(q703.add(3));
        System.out.println(q703.add(5));
        System.out.println(q703.add(10));
        System.out.println(q703.add(9));
        System.out.println(q703.add(4));
    }
}

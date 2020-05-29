import java.util.LinkedList;
import java.util.Stack;

public class Q1036 {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {

        boolean[][] visited = new boolean[10^6][10^6];

        Stack<int[]> stack = new LinkedList<>();
        stack.add(source);
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        visited[source[0]][source[1]] = true;

        while (!stack.isEmpty()) {
            int[] positon = stack.pop();
            if (positon[0] == source[0] && positon[1] == source[1]) {
                return true;
            }

            //

        }


        return false;
    }
}

package Bilibili;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PreTest {
    public static void main(String[] args) {
        // 0表示能白色方块能通过，1表示灰色方块有障碍物
        int[][] array ={{0, 0, 0, 1, 1, 0, 0},
                        {0, 1, 0, 1, 0, 0, 1},
                        {1, 1, 0, 1, 0, 1, 1},
                        {1, 0, 0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 0, 0, 0},
                        {1, 0, 0, 1, 0, 1, 1}};

        // 坐标为左上角的点，如图中左上角第一个方格，坐标就为(0,0)，到达右上角的格子目标坐标就为(0,6)
        System.out.println(bfs(array, 0, 0, 0, 5));
    }

    public static int bfs(int[][] array, int startX, int startY, int destX, int destY) {
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startX, startY});
        HashSet<int[]> hs = new HashSet<>();

        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; --i) {
                int[] tmp = queue.poll();

                if (tmp[0] == destX && tmp[1] == destY) {
                    return res;
                }
                //up
                int[] tmp2;
                int ans = 0;

                if (tmp[0] > 0 && array[tmp[0] - 1][tmp[1]] != 1 && !hs.contains(tmp2 = new int[]{tmp[0] - 1, tmp[1]})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                    ans += 1;
                }

                if (tmp[0] < array.length - 1 && array[tmp[0] + 1][tmp[1]] != 1 && !hs.contains(tmp2 = new int[]{tmp[0] + 1, tmp[1]})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                    ans += 1;

                }

                if (tmp[1] > 0 && array[tmp[0]][tmp[1] - 1] != 1 && !hs.contains(tmp2 = new int[]{tmp[0], tmp[1] - 1})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                    ans += 1;
                }

                if (tmp[1] < array[0].length - 1 && array[tmp[0]][tmp[1] + 1] != 1 && !hs.contains(tmp2 = new int[]{tmp[0], tmp[1] + 1})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                    ans += 1;
                }
            }
            res += 1;

        }
        return -1;
    }

}

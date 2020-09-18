package YearOne.Vivo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameMap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] array = new char[n + 1][n + 1];
        //s.nextLine();
        int startX = s.nextInt();
        int startY = s.nextInt();
        int destX = s.nextInt();
        int destY = s.nextInt();
        s.nextLine();
        //System.out.println(destY);
        for (int i = 0; i < n; i++) {
            String inp = s.nextLine();
            for (int j = 0; j < n; j++) {
                array[i][j] = inp.charAt(j);
            }
        }

        System.out.println(bfs(array, startX, startY, destX, destY));
    }

    public static int bfs(char[][] array, int startX, int startY, int destX, int destY) {

        int res = 0;
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startX, startY});
        // 用HashSet记录遍历过的点
        HashSet<int[]> hs = new HashSet<>();

        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; --i) {
                int[] tmp = queue.poll();

                if (tmp[0] == destX && tmp[1] == destY) {
                    return res;
                }

                int[] tmp2;

                /**
                 * 注意边界条件
                 */

                // 向上可走
                if (tmp[0] > 0 && array[tmp[0] - 1][tmp[1]] != '#' && array[tmp[0] - 1][tmp[1]] != '@' && !hs.contains(tmp2 = new int[]{tmp[0] - 1, tmp[1]})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                }

                // 向下可以走
                if (tmp[0] < array.length - 1 && array[tmp[0] + 1][tmp[1]] != '#' && array[tmp[0] + 1][tmp[1]] != '@' && !hs.contains(tmp2 = new int[]{tmp[0] + 1, tmp[1]})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);

                }

                // 向左可走
                if (tmp[1] > 0 && array[tmp[0]][tmp[1] - 1] != '@' && array[tmp[0]][tmp[1] - 1] != '#' && !hs.contains(tmp2 = new int[]{tmp[0], tmp[1] - 1})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                }

                // 向右可走
                if (tmp[1] < array[0].length - 1 && array[tmp[0]][tmp[1] + 1] != '#' && array[tmp[0]][tmp[1] + 1] != '@' && !hs.contains(tmp2 = new int[]{tmp[0], tmp[1] + 1})) {
                    hs.add(tmp2);
                    queue.offer(tmp2);
                }
            }

            res += 1;

        }
        return -1;
    }

}

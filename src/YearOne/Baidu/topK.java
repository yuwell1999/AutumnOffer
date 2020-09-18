package YearOne.Baidu;

import java.util.Comparator;
import java.util.PriorityQueue;

public class topK {
    public static int K = 10;

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 小根堆
                return o1 - o2;
            }
        });

        for (int i = 0; i < 100; i++) {
//            pq.add(i);
            if (pq.size() < 10) {
                pq.add(i);
            } else {
                int tmp = pq.peek();
                if (tmp > i) {
                    pq.poll();
                    pq.add(i);
                }
            }
        }

        while (pq.size() != 0) {
            System.out.println(pq.poll());
        }

    }
}

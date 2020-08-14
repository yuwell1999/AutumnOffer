package Bilibili;

import java.util.Arrays;
import java.util.Scanner;

public class BestWeight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] arr = s.nextLine().split(" ");
        int[] weights = new int[arr.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(bestWeight(weights));
    }

    public static int bestWeight(int[] weights) {
        int[] weight = new int[weights.length];
        Arrays.fill(weight, 1);

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > weights[i - 1]) {
                weight[i] = weight[i - 1] + 1;
            }
        }

        int sum = weight[weight.length - 1];

        for (int i = weights.length - 2; i >= 0; i--) {
            if (weights[i] > weights[i + 1]) {
                weight[i] = Math.max(weight[i], weight[i + 1] + 1);
            }
            sum += weight[i];
        }

        return sum;
    }
}

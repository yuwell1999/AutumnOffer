package Didi;

import java.util.Scanner;

public class FibbonacciSnake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long[] fib = new long[n * n];
        long[][] arr = new long[n][n];

        fib = fibb(fib);
        //System.out.println(fib[fib.length-1]);

        arr = matrix(fib, arr);
        if(n==1){
            System.out.println(1);
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][arr[0].length - 1]);
        }
    }

    public static long[] fibb(long[] arr) {
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }

    public static long[][] matrix(long[] fib, long[][] arr) {

        int left = 0, right = arr.length - 1, up = 0, down = arr.length - 1;
        int cnt = arr.length * arr.length - 1;

        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                arr[up][i] = fib[cnt--];
            }
            up++;

            for (int i = up; i <= down; i++) {
                arr[i][right] = fib[cnt--];
            }
            right--;

            for (int i = right; i >= left && down >= up; i--) {
                arr[down][i] = fib[cnt--];
            }
            down--;
            for (int i = down; i >=up && left <= right; i--) {
                arr[i][left] = fib[cnt--];
            }
            left++;
        }
        return arr;
    }
}

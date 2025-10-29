package Pertemuan3_RemedUTP;
import java.util.Scanner;

public class DoctorStrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int start = -1, end = -1;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int currentStart = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            boolean update = false;
            if (currentSum > maxSum) {
                update = true;
            } else if (currentSum == maxSum) {
                int currentLength = i - currentStart + 1;
                if (currentLength < minLength) {
                    update = true;
                } else if (currentLength == minLength && currentStart < start) {
                    update = true;
                }
            }

            if (update) {
                maxSum = currentSum;
                start = currentStart;
                end = i;
                minLength = i - currentStart + 1;
            }

            if (currentSum < 0) {
                currentSum = 0;
                currentStart = i + 1;
            }
        }

        if (maxSum == Integer.MIN_VALUE) {
            int maxVal = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    idx = i;
                }
            }
            maxSum = maxVal;
            start = end = idx;
        }

        System.out.println("Kekuatan maksimum = " + maxSum);
        System.out.print("Jalur energi =");
        for (int i = start; i <= end; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
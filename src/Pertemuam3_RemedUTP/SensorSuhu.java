package Pertemuam3_RemedUTP;
import java.util.Scanner;

public class SensorSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int kritis = 0;
        int eror = 0;
        boolean kondisi = false;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > 50 && arr[i - 1] > 50) {
                kritis++;
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > 50 && arr[i - 1] <= 50||arr[i]<=50&&arr[i-1]>50) {
                eror++;
            }
            if (arr[i] > 50 && arr[i - 1] > 50|| arr[i] <= 50 && arr[i - 1] <= 50) {
                kondisi = false;
            }
        }
        if(eror>=4){
            kondisi = true;
        }
        scanner.close();
        if (kritis >= 4) {
            System.out.println("Alarm kritis!");
        } else if (kritis==3) {
            System.out.println("Alarm aktif!");
        } else if (kondisi) {
            System.out.println("Alarm error!");
        } else {
            System.out.println("Alarm tidak aktif.");
        }
    }
}
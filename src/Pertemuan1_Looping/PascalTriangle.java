package Pertemuan1_Looping;
import java.io.*;
import java.util.*;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();        
        for (int i=0; i<n; i++){
            for (int j=1; j < n-i; j++){
                System.out.print(" ");
            }
            int angka=1;
            for (int j=0; j<=i; j++){
                System.out.print(angka+" ");
                angka = angka*(i-j)/(j+1);
            }
            System.out.println();
        }
        in.close();
    }
}
package Pertemuan1_Looping;
import java.io.*;
import java.util.*;

public class FibonacciFun {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x =  in.nextInt();
        if (x<=0){
            System.out.println("Masukkan angka positif!");
        }
        else {
            int a=0, b=1, c=0;
            System.out.print(a+" ");
            System.out.print(b+" ");
            for (int k=0; k<=x-2; k++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
        in.close();
    }
}
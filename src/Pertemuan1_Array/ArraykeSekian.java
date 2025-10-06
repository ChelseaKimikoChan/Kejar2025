package Pertemuan1_Array;
import java.util.Scanner;
public class ArraykeSekian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt() - 1;
        String[] kalimat = new String[n];
        for(int i=0; i<kalimat.length; i++){
            kalimat[i] = in.next();
        }
        System.out.print(kalimat[x]);
    }
}

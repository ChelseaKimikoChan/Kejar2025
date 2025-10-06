package Pertemuan1_Array;
import java.util.Scanner;
public class JumlahBarisDanKolom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] array = new int[m][n];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = in.nextInt();
            }
        }
        int[] baris = new int[m];
        int[] kolom = new int[n];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                baris[i]+= array[i][j];
                kolom[j]+=array[i][j];
            }
        }
        System.out.print("Hasil penjumlahan pada baris adalah ");
        for(int i=0; i<array.length; i++){
            System.out.print(baris[i]+" ");
        }
        System.out.print("\nHasil penjumlahan pada kolom adalah ");
        for(int i=0; i<array[0].length; i++){
            System.out.print(kolom[i]+" ");
        }
    }
}

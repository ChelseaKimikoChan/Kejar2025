package Pertemuan2_UTP;
import java.util.Scanner;
public class ElemenTersering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] b = new int[a];
        int[][] pear = new int[a][2];

        // INPUT ARRAY
        for (int i = 0; i < a; i++) {
            b[i] = input.nextInt();
            pear[i][0] = b[i];
        }

        // HITUNG FREKUENSI
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(b[i] == b[j]){
                    pear[i][1]++;
                }
            }
        }

        // MENDAPATKAN FREKUENSI TERBESAR BESERTA ANGKANYA
        int frekuensi = 0;
        int angka = b[0];
        for (int i = 0; i < b.length; i++) {
            if(frekuensi < pear[i][1]){
                frekuensi = pear[i][1];
                angka = pear[i][0];
            }
        }

        // MENDAPATKAN ANGKA TERKECIL
        for(int i=0; i<b.length; i++){
            if(frekuensi == pear[i][1]){
                if(angka > pear[i][0]){
                    angka = pear[i][0];
                }
            }
        }

        System.out.println("ELemen tersering: "+angka);
        System.out.println("Frekuensi: "+frekuensi+ " kali");
    }
}
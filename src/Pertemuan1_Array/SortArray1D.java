package Pertemuan1_Array;
import java.util.Scanner;

public class SortArray1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] deret = new int[n];

        //Menyimpan deret di array
        for(int i=0; i<deret.length; i++){
            deret[i] = in.nextInt();
        }

        //Sorting
        for (int i = 1; i < deret.length; i++) {
            for (int j = 0; j < deret.length-1; j++) {
                if (deret[j] > deret[j+1]) {
                    int temp = deret[j+1];
                    deret[j+1]= deret[j];
                    deret[j] = temp;
                }
            }
        }

        //Print
        for(int i=0; i<deret.length; i++){
            System.out.print(deret[i]);
            if(i!=deret.length-1){
                System.out.print(" ");
            }
        }    
    }
}

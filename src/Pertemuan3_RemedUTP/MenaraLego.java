package Pertemuan3_RemedUTP;
// 60/100
import java.util.Scanner;
public class MenaraLego {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String[] color = new String[n];
        int[] num = new int[n];
        for(int i = 0; i<color.length; i++){
            color[i] = in.next();
            num[i] = in.nextInt();
        }

        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] < num[j+1]) {
                    int temp = num[j+1];
                    num[j+1]= num[j];
                    num[j] = temp;

                    String temp2 = color[j+1];
                    color[j+1] = color[j];
                    color[j] = temp2;
                }
            }
        }

        int fr=1;
        int frTemp=100;
        int tipe=0;
        for(int i=1; i<color.length; i++){
            if(color[i-1].equals(color[i])){
                fr++;
            }
            else{
                if(frTemp>fr){
                    frTemp=fr;
                }
                fr=1;
                tipe++;
            }
        }

        if(frTemp>fr){
            frTemp=fr;
        }

        String colorType[] = new String[tipe+1];

        int a=0;
        for(int i=1; i<color.length; i++){
            if(!color[i-1].equals(color[i])){
                colorType[a] = color[i-1];
                a++;
            }
        }
        colorType[a] = color[n-1];

        System.out.println(frTemp*colorType.length);
        for(int i=0; i<colorType.length; i++){
            for(int j=0; j<frTemp; j++){
                System.out.println(colorType[i]);
            }
        }
    }
}

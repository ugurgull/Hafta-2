import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : " + Arrays.toString(list));

        System.out.print("Girilen sayi : ");
        int sayi =input.nextInt();
        int min = sayi;
        int max = sayi;

        Arrays.sort(list);
        System.out.println("Sirali dizi : " + Arrays.toString(list));

        for ( int i : list) {
            if (i > sayi) {
                max = i;
                break;
            }
        }
        for(int i = list.length-1; i >= 0; i--){
            if ( list[i] < sayi){
                min = list[i];
                break;
            }
        }
        System.out.println("En yakin buyuk sayi : " + max);
        System.out.println("En yakin kucuk sayi : " + min);
    }
}

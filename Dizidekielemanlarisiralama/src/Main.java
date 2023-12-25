import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner sinifimizi tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarini giriniz : ");

        //dizimizi tanimlayalim
        int[] list = new int[n];
        for(int i = 0; i < list.length; i++){
            System.out.print(i + ". Elemani : ");
            list[i] = input.nextInt();
        }
        int max;
        for (int i =0; i < list.length; i++){
            for(int j = i; j < list.length; j++){
                if(list[i] > list[j]){
                    max = list[i];
                    list[i] = list[j];
                    list[j] = max;
                }
            }
        }
        System.out.println("Siralama : ");
        System.out.println(Arrays.toString(list));
    }
}

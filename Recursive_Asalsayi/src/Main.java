import java.util.Scanner;

public class Main {

    static int asal(int n) {
        int asal;
        if (n == 1) {
            return n;
        } else {
            asal = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    asal++;
                }
            }
        }

        return asal;
    }

    public static void main(String[] args) {
        //scanner sinifimizi girelim
        Scanner input = new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("Sayi giriniz : ");
        int n = input.nextInt();

        if (asal(n)==0){
            System.out.println(n + " Asal sayidir!");
        }
        else {
            System.out.println(n + " Asal sayi degildir!");
        }
    }
}



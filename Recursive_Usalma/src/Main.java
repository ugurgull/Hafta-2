import java.util.Scanner;

public class Main {

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            return result;
        }

    }


    public static void main(String[] args) {
        //Scanner sinifimizi tanimlayalim
        Scanner input = new Scanner(System.in);

        //Kullanicidan degerlerimizi alalim
        System.out.print("Taban degerini giriniz : ");
        int a = input.nextInt();

        System.out.print("Us degerini giriniz : ");
        int b = input.nextInt();

        System.out.println("Sonuc : " + power(a, b));

    }
}

import java.util.Scanner;

public class Main {

    public static void dongu(int n){
        System.out.println(n + " ");
        if (n <= 0){
            return;
        }
        dongu(n-5);
        System.out.println(n + " ");
    }


    public static void main(String[] args) {
        //scanner sinfimizi tanimlayalim
        Scanner input =new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("N sayisini giriniz : ");
        int n = input.nextInt();
        dongu(n);


    }
}

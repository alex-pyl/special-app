import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println("Угадайте число 0-100");
        /*while(true){
            int attempt = new Scanner(System.in).nextInt();
            if(value == attempt){
                System.out.println("Вы угадали!");
                break;
            }
            else{
                System.out.println(value > attempt ? "Загаданное число больше" : "Загаданное число меньше");
            }
        }*/
        for(int i=0;i<10;){
            if(i<5){
                i++;
            }
            i++;
            System.out.println("YES");
        }
    }
}

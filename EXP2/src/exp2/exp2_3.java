package exp2;

import java.util.Random;
import java.util.Scanner;
public class exp2_3 {
    public static void main(String[] args) {
        System.out.println("剪刀石头布！（1.剪刀，2.石头，3.布）");
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int my;
        my= reader.nextInt();
        while(my<1 || my>3){
            System.out.println("别耍赖");
            my = reader.nextInt();
        }
        int bot = random.nextInt(3)+1;
        int result = my%3-bot%3;
        System.out.println(bot);
        switch (result)
        {
            case 0:
                System.out.println("平局");
                break;
            case 1:
                System.out.println("胜");
                break;
            case -1:
                System.out.println("败");
                break;
        }
    }

}

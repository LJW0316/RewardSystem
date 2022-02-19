package exp2;

import java.util.Scanner;
public class exp2_1 {
    public static void main(String[] args) {
        System.out.println("输入3个1-100的整数");
        Scanner reader = new Scanner(System.in);

        int counter = 0;
        int x = 0;

        while(counter<3){
            if(reader.hasNextInt()) {
                x=reader.nextInt();
                if(x>=1&&x<=100){
                    counter++;
                    System.out.println("第"+counter+"次有效输入为："+x);
                }
                else{
                    System.out.println("输入越界");
                }
            }
            else{
                System.out.println("输入非整数");
                String retrieve=reader.next();
            }
        }
    }
}

public class exp3_1 {
    public static void main(String[] args) {
        int num;
        int divisor;
        for(num = 101;num <= 200;num++){
            for(divisor = 2;divisor<=num;divisor++){
                if(num%divisor==0)
                    break;
                }
            if(divisor==num)
                System.out.println(num+"是质数");
        }
    }
}


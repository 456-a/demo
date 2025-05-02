import java.util.Random;
import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args){
        Random r=new Random();
        int num=r.nextInt(100);//[0,99]
        Scanner sc=new Scanner(System.in);
        System.out.println(num);

        int count=0;

       while(true) {
           System.out.println("输入猜的数字");
           int guess=sc.nextInt();
           count++;
           if(count==3){
               System.out.println("猜中了");
               break;
           }

           if (guess < num) {
               System.out.println("小了");
           } else if (guess > num) {
               System.out.println("大了");
           } else {
               System.out.println("对了");
               break;
           }
       }
    }
}

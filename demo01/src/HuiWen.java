import java.util.Scanner;
public class HuiWen {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("输入数字判断是否为回文数");
        int num=sc.nextInt();
        int temp=num;//定义一个临时变量来获取num原来的值，最后用于比较
        int num1=0;
        while(num!=0){
            int ge=num%10;
            num=num/10;
            num1=num1*10+ge;
        }
       // System.out.println(num1);
       System.out.println(num1 == temp);

    }
}

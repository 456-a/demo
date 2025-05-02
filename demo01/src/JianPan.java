//1.导包，必须出现在类定义的上边

import java.util.Scanner;
public class JianPan {
    public static void main(String[] args){
        //2.创建对象
         Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        //3.数据接收
        int num1=sc.nextInt();
        System.out.println("请输入第二个数");
        int num2=sc.nextInt();
        System.out.println(num1+num2);


    }
}

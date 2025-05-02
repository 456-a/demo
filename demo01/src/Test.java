import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入被除数");
        int num1=sc.nextInt();//被除数
        System.out.println("输入除数");
        int num2=sc.nextInt();//除数
        int i=0;
        while(num1>=num2){
            num1-=num2;
            i++;
        }
        System.out.println("商为"+i);
        System.out.println("余数为"+num1);


    }
}

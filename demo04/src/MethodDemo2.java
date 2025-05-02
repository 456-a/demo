import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        getSum(num1,num2);
    }
    public static void getSum(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);

    }
}

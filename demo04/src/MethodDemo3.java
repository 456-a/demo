import java.util.Scanner;
public class MethodDemo3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("len and width");
        int len=sc.nextInt();
        int width=sc.nextInt();
        getLength(len,width);
    }
    public static void getLength(int len,int width){
        int C=(width+len)*2;
        System.out.println("周长为"+C);
    }
}

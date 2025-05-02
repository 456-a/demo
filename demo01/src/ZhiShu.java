import java.util.Scanner;
public class ZhiShu {
    public static void main(String[] args) {
         boolean flag = true;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数");
        int n=sc.nextInt();
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("shi");
        }else System.out.println("bushi");
    }
}

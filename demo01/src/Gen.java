import java.util.Scanner;
public class Gen {
    public static void main(String[] args){
        System.out.println("输入大于等于2的数");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i*i==num){
                System.out.println(i);
                break;
            } else if (i*i>num) {
                System.out.println(i-1);
                break;

            }
        }

    }
}

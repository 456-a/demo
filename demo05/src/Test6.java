import java.util.Scanner;
import java.util.Random;
public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //得到四位密码
        int[] oldArr=new int[4];
        int count=1;
        for(int i=0;i<oldArr.length;i++) {
            System.out.println("第"+count+"为");
            oldArr[i]=sc.nextInt();
            count++;
        }
        System.out.println();
        //加密：1.每位+5 2.对10求余 3.数字反转
       encCode(oldArr);
    }
    //方法：加密
    public static void encCode(int[] oldArr){
        int[] newArr=new int[4];
        //+5 %10
        for(int i=0;i<oldArr.length;i++){
            newArr[i]=(oldArr[i]+5)%10;
        }
        //newArr遍历
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"  ");
        }
        System.out.println();
        //数字反转
        for(int i=0,j=newArr.length-1;i<j;i++,j--){
            int temp=0;
            temp=newArr[i];
            newArr[i]=newArr[j];
            newArr[j]=temp;
        }
        int number=0;
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"  ");
          number=number*10+newArr[i];
        }
        System.out.println();
        System.out.print(number);
    }

}

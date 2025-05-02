import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args){
        int [] arr=new int[10];
        Random r=new Random();
        int sum=0;

      for(int i=0;i<arr.length;i++){
          int num= r.nextInt(100)+1;
          arr[i]=num;
          System.out.print(num+"  ");
         
      }
        System.out.println();
      for(int a=0;a<arr.length;a++) {
          sum+=arr[a];
      }
      System.out.println("随机的十个数和为"+sum);
      int ping=sum/arr.length;
      System.out.println("平均值为"+ping);
      int count=0;
      for(int b=0;b<arr.length;b++){
          if (arr[b]<ping) {
              count++;
          }
      }
      System.out.println("有"+count+"个比平均值小");



    }
}

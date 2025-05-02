import java.net.BindException;
import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        //用来判断被抽取的数是否存在

        for(int i=0;i<arr.length;){
            int index=r.nextInt(arr.length);
            boolean exist=false;
            for (int j = 0; j < arr.length; j++) {
                //判断元素是否已存在
                if(newArr[j]==arr[index]){
                    exist=true;
                }
            }
            //如果没抽到这个过，就抽这个
            if(!exist){
                newArr[i]=arr[index];
                i++;
                System.out.println(arr[index]+"元已抽出");
            }
        }




    }
    //判断prize在数组中是否存在  存在：true   不存在：false

}

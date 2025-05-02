public class ArrayTest {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            arr[i]=arr[i]/2;
        }else{
            arr[i]=arr[i]*2;
        }
        //一个循环只做一事情 System.out.print(arr[i]+"  ");
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }




       /* int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("有"+count+"个能被三整除");
    }*/
}

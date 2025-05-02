public class Test6_1 {
    public static void main(String[] args) {
        int num=1983;
        //临时变量
        int temp=num;
        int count=0;
        //判断数字长度
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int[] arr=new int[count];
        int index=arr.length-1;
        //获取每一位
        while(num!=0){
            int wei=num%10;
            num/=10;
            arr[index]=wei;
            index--;
        }
        //遍历arr
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        }

    }



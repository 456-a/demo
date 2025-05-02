public class Array {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};//静态初始化
       // String [] arr2={"s","d","e","f"};
        //double [] arr3={1.1,2.2,3.3};
       // System.out.println(arr2[2]);
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

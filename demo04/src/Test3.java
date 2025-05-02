public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(cun(arr,9));

    }
    public static boolean cun(int[] arr,int count){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==count){
                return true;
            }
        }return false;

    }
}

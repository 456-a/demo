public class Test2 {
    public static void main(String[] args) {
        int[] arr={54,23,34,54,58,65,67,45,75};
        System.out.println(max(arr));
    }
    public static int max(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }
        return max;
    }
}

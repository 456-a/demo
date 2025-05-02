import java.util.Random;

public class Test7_1 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        //打乱数组
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        //遍历打乱后数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}

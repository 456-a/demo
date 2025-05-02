import java.util.Scanner;
public class Test6_2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        //获取加密数据
        getCode(arr);
        //解锁反转
        unlockCode1(arr);
        //判断每个索引下的数据大小  +5:5~14  %10 5~9(5~9)  0~4(10~14)
        //解锁10%
        unlockCode2(arr);
        //解锁+5
        unlockCode3(arr);
    }
    //获取加密数据
    public static int[] getCode(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("加密后的第" + count + "位数据");
            arr[i] = sc.nextInt();
            count++;
        }
        return arr;
    }
    //方法：解锁反转
    public static int[] unlockCode1(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //方法：解锁10%
    public static int[] unlockCode2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }
        return arr;
    }
    //方法：解锁+5
    public static int[] unlockCode3(int[] arr) {
        System.out.println("正确密码为");
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
            System.out.print(arr[i]+"  ");
        }
        return arr;
    }

}

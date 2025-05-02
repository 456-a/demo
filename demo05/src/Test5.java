import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        getRandomArr(arr);
        //遍历排序前的
        traOldArr(arr);
        //排序
        rankArr(arr);
        //遍历排序后的
        traNewArr(arr);
        //去掉最高和最低求平均值
        getAvg(arr);
    }

    //方法：得到随机分数
    public static int[] getRandomArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(101);
        }
        return arr;
    }

    //遍历原数组
    public static void traOldArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    //方法:排序
    public static int[] rankArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    //遍历新数组
    public static void traNewArr(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + "  ");
        }
    }

    //去max min求平均值
    public static void getAvg(int[] arr) {
        double temp = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            temp += arr[i];
        }
        double avg = temp / (arr.length - 2);
        System.out.println();
        System.out.println("平均值为" + avg);
    }
}




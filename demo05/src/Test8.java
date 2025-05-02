import java.util.Scanner;
import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
//接收中奖号码和用户的号码
        int[] arr = createNumber();
        System.out.println("===========================");
        //遍历中奖号码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        int[] userArr = userInputNumber();
        //判断红球的中奖情况
        int redCount = 0;
        int blueCount = 0;
        //遍历得到用户的前6个红球号码
        for (int i = 0; i < userArr.length - 1; i++) {
            if (contains(arr, userArr[i])) {
                redCount++;
            }
        }
        System.out.println();
        System.out.println("有" + redCount + "个红球号码相同");
        //判断用户蓝球是否相同
        if (contains(arr, userArr[userArr.length - 1])) {
            blueCount++;
        }
        System.out.println("有" + blueCount + "个篮球相同");

        //奖项
        if (redCount == 6 && blueCount == 1) System.out.println("中奖1000万");
        else if (redCount == 6 && blueCount == 0) System.out.println("中奖500万");
        else if (redCount == 5 && blueCount == 1) System.out.println("中奖3000元");
        else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) System.out.println("中奖200元");
        else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) System.out.println("中奖10元");
        else  if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1))
            System.out.println("中奖5元");
        else System.out.println("谢谢参与");
    }

    //用来创建双色球号码
    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        //红球
        for (int i = 0; i < arr.length - 1; ) {
            //判断是否重复
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //蓝球
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    //判断是否重复(前6个红球的数字要不重复,用户和中奖号码)
    public static boolean contains(int[] arr, int number) {
        boolean exist = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                exist = true;
            }
        }
        return exist;
    }

    //用来记录用户的双色球号码
    public static int[] userInputNumber() {
        Scanner sc = new Scanner(System.in);
        int[] userArr = new int[7];
        int count = 1;
        for (int i = 0; i < userArr.length - 1; ) {
            System.out.println("输入第" + count + "位红球号码");
            int number = sc.nextInt();
            //判断用户输入的正不正确
            //判断大小，和是否唯一
            if (number >= 1 && number <= 33) {
                if (!contains(userArr, number)) {
                    userArr[i] = number;
                    count++;
                    i++;
                } else System.out.println("该号码不正确，重复输入");

            } else {
                System.out.println("该号码不正确，超出范围");
            }
        }
        //1~16
        while (true) {
            System.out.println("输入第7位蓝球号码");
            int number = sc.nextInt();
            if (number >= 1 && number <= 16) {
                userArr[userArr.length - 1] = number;
                break;
            } else {
                System.out.println("该号码不正确，超出范围");
            }
        }
        return userArr;
    }
}


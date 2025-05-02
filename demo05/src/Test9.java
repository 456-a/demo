public class Test9 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        getSum(arr);
    }

    //求每个季度和一整年的营业额
    public static void getSum(int[][] arr) {

        int yearSum=0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                yearSum +=sum;
            }
            System.out.println("第" + (i + 1) + "个季度的总营业额为" +sum);
        }
        System.out.println("全年总营业额为" + yearSum);
    }
}

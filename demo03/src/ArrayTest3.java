public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1;
        i < j;
        i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }


    }
}



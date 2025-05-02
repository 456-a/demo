public class Test4 {
    public static void main(String[] args) {
        int[] oldArr={1,2,3,4,5,6,7,8,9,10};
        int[] newArr=new int[oldArr.length];
        for(int i=0;i<oldArr.length;i++){
            newArr[i]=oldArr[i];
            System.out.print(oldArr[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"  ");
        }
    }
}

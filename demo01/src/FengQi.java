public class FengQi {
    public static void main(String[] args){
        System.out.println("符合逢7过条件的数字");
        for(int i=1;i<=100;i++){
            if(i%7==0||i%10==7||i/10%10==7){
                System.out.print("过");
                continue;
            }
            System.out.print("  "+i);
        }
    }
}

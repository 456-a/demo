import java.util.Random;

public class SuiJi {
    public static void main(String[] args){
        Random r=new Random();

        for(int i=0;i<20;i++) {
            int num=r.nextInt( 100)+1;
            System.out.print(num+"  ");
        }
        }

    }


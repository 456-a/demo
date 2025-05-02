import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) ('a' + i);//a97;z122;A65;Z90
            } else {
                chs[i] = (char) ('A' + i - 26);
            }
        }
        for(int i=0;i<5;i++){
            String result = "";
            for (int j = 0; j < 4; j++) {
                int randomIndex = r.nextInt(chs.length);//chs [num1];
                result += chs[randomIndex];
            }
            int num = r.nextInt(10);
            result +=num;
            System.out.println("验证码为"+result);
        }

    }
}




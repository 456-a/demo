import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("原价");
        int ticket = sc.nextInt();//票
        System.out.println("月份");
        int month = sc.nextInt();//月
        if (month > 12 || month < 1) {
            System.out.println("没这个月");
            return;
        }
        System.out.println("那个仓 0 头等舱   1 经济舱");
        int seat = sc.nextInt();//座位
        if (seat < 0 || seat > 1) {
            System.out.println("没这个舱");
            return;
        }

        if (month >= 5 && month <= 8) {
            ticket = getTicket(seat, ticket);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            if (ticket == 0) {
                ticket = (int) (ticket * 0.7);
            } else ticket = getTicket(ticket);
        }

        System.out.println("价格为" + ticket);


    }

    private static int getTicket(int seat, int ticket) {//ctrl alt m
        if (seat == 0) {
            ticket = (int) (ticket * 0.9);
        } else ticket *= 0.9;
        return ticket;
    }

    private static int getTicket(int ticket) {
        return (int) (ticket * 8.5);
    }
}

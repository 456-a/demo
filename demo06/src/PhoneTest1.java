public class PhoneTest1 {
    public static void main(String[] args) {
        Phone p=new Phone();
        Phone p1=new Phone();
        p.brand="小米";
        p1.brand="苹果";

        p.price=1999.98;
        p1.price=1555.35;
        System.out.println(p1.brand);
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p1.price);
        p.call();
        p.call();
        p1.playGame();
        p1.playGame();


    }
}

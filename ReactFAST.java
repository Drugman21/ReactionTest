import java.util.Scanner;

public class ReactFAST {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        System.out.println("GO!!!");

        long starTime = System.currentTimeMillis();

        Scanner s = new Scanner(System.in);
        s.next();

        long stopTime = System.currentTimeMillis();

        long reactionTime = stopTime - starTime;
        System.out.println(reactionTime+" ms");

    }
}
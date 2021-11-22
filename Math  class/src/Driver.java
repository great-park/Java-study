import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(10));   // 0 이상 9 이하의 랜덤한 값09

        int min = 10;
        int max = 30;

        System.out.println(rand.nextInt((max - min) + 1) + min); // 10 이상 30 이하의 랜덤한 값
    }
}
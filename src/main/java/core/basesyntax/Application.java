package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ball = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i]);
        }
    }
}

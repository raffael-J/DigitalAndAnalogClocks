import timer.MyTimer;

public class Main {

    public static void main(String[] args) {
        MyTimer clockTimer = new MyTimer();

        new AnalogTimer(clockTimer);
        new DigitalTimer(clockTimer);
    }

}

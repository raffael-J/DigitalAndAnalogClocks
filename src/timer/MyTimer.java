package timer;

import java.util.Calendar;
import java.util.TimerTask;

public class MyTimer implements ClockTimer{

    private Calendar cal;
    private Timer timer;

    public MyTimer() {
        cal = Calendar.getInstance();
        timer = new Timer();

        timer.schedule(new TimerAction(), 0, 1000);
    }

    class TimerAction extends TimerTask {

        @Override
        public void run() {
            cal = Calendar.getInstance();
            tick();
        }
    }

    @Override
    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }

    @Override
    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    }

    @Override
    public int getSecond() {
        return cal.get(Calendar.SECOND);
    }

    @Override
    public void tick() {

    }
}

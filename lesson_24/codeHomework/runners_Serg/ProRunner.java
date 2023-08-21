package runners_Serg;

public class ProRunner extends Human{
    public ProRunner() {
        super();
    }

    @Override
    public void setDefaultValues() {
        setSpeed(25);
        setRestTime(5);
    }

    @Override
    public void run() {
        System.out.println("Pro-runner run with speed: " + getSpeed());
        rest();
    }

    @Override
    public void rest() {
        System.out.println("The pro-runner began resting for a duration: " + getRestTime());
    }
}

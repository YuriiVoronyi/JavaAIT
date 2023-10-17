package homework_65;

public class MultiDemo extends Thread{
    char symbol;
    public MultiDemo(String name, char symbol){

        super(name);
        this.symbol = symbol;
    }

    //  метод run  - это и есть тот метод, который выполняется в потоке
    public void run(){
        // System.out.println(" MultiDemo thread is running now");
        System.out.println(Thread.currentThread().getName() +" started");
        for (int i = 1; i <= 100; i++) {
            System.out.println(symbol);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

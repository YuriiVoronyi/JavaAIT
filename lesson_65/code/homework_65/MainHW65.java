package homework_65;

public class MainHW65 {
    public static void main(String[] args) {
        /*
        Написать метод 100 раз печатающий char и вывести на экран результат его работы
        для двух потоков ( например, один поток печатает # , второй *). В конце должно
        выводиться " end of main"
        */
        System.out.println("Main thread starting");

        MultiDemo multiDemo1 = new MultiDemo("Demo#1",'#');
        MultiDemo multiDemo2 = new MultiDemo("Demo#2",'*');

        multiDemo1.start();
        multiDemo2.start();

        try {
            multiDemo1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        try {
            multiDemo2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of main");

    }
}

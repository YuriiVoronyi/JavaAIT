package homework_20;

public class Dog {
    private String name;
    private int jumpHeight;
    //private int maxJumpHeight;
    final int maxJumpHeight;
    private static int numberOfJumps;  //Поле для хранения количества прыжков

    static final int MULTIPLIER = 2;//Добавили константу для рассчета максимально возможной высоты прыжка

    static { numberOfJumps = 0; }  //Статический блок инициализации

    public static int getNumberOfJumps() {//Статический метод, возвращающий общее количество прыжков, сделанных всеми собаками
        return numberOfJumps;
    }

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * MULTIPLIER;//Применили константу для рассчета максимально возможной высоты прыжка
    }

    public String getName() {
        return name;
    }
    public int getJumpHeight() {
        return jumpHeight;
    }
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
    public void setName(String parName) {
        this.name = parName;
    }
    public void setJumpHeight(int parJumpHeight) {
        if(parJumpHeight < 0) {
            this.jumpHeight = 0;
        } else {
            this.jumpHeight = parJumpHeight;
        }
    }
    /*public void setMaxJumpHeight(int parMaxJumpHeight) { УСТАНАВЛИВАЕТСЯ В КОНСТРУКТОРЕ !!!!!!!!!!!
        if(parMaxJumpHeight < 0) {
            this.maxJumpHeight = 0;
        } else {
            this.maxJumpHeight = parMaxJumpHeight;
        }
    }*/

    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    void jump() {
        System.out.println("Я прыгаю!");
        numberOfJumps += 1;//Засчитываем прыжок собаки
    }

    private void jump(int height) {                       //Закрыли доступ извне
        System.out.println("Я перепрыгиваю барьер " + height + " см");
        numberOfJumps += 1;//Засчитываем прыжок собаки
    }

    boolean getBarrier(int barrierHeight){ // 100, 200, 150
        boolean rez;
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight){
                training();
            }
        }

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            rez = true;
        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
            rez = false;
        }

        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
        return rez;
    }

    void training() {
        System.out.println("start training");
        if (jumpHeight + 10  <= maxJumpHeight) { // 50 -> 100 -> x <= 100 - 10 (90)
            jumpHeight += 10;
            System.out.println("Я потренировался!") ;
            whoAmI();
        }

        else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }
}

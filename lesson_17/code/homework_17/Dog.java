package homework_17;

public class Dog {
    String name;
    int jumpHeight;
    int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    void jump() {
        System.out.println("Я прыгаю!");
    }

    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");
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

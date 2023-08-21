package runners_Serg;
/*
Напишите иерархию классов человек -> спортсмен-любитель - > спортсмен-профи. У человека есть метод бежать.
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе.
Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

/* --- OUTPUT
Human run with speed: 10
The human began resting for a duration: 15
Sportsman run with speed: 15
The sportsman began resting for a duration: 10
Pro-runner run with speed: 25
The pro-runner began resting for a duration: 5
 */

/*
P.S. Мы не должны забывать, что в наследство достается и состояние класса-родителя.
Т.е., говоря проще, не только методы, но и поля (переменные) класса.

состояние - поля
поведение - методы
 */

public class Human {
    private int speed;
    private int restTime;

    public Human() {
        setDefaultValues();
    }

    public void setDefaultValues() {
        setSpeed(10);
        setRestTime(15);
    }

    public Human(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println("Human run with speed: " + speed);
        rest();

    }

    public void rest() {
        System.out.println("The human began resting for a duration: " + restTime);
    }

    public int getSpeed() {
        return speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}

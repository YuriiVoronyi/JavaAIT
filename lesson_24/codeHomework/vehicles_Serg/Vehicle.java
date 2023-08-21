package vehicles_Serg;
/*
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

/* --- OUTPUT
Auto {id=0, title='VW Passat', engine=Engine{id=1, model='VW-001', power=200}}
Engine id:1 starts

Bicycle {id=1, title='Swallow'}
What? Start engine? I haven't engine!

Motorcycle {id=2, title='Honda pwt', engine=Engine{id=3, model='Hnd-500', power=150}}
Engine id:3 starts

Auto {id=3, title='Sedan x', engine=Engine{id=4, model='Eng-001', power=150}}
Engine id:4 starts
 */
public class Vehicle {
    private final int id;
    private String title;
    private Engine engine;

    private static int counter;

    public Vehicle(String title) {
        this.title = title;
        this.id = counter++;
        setDefaultValues();
    }

    public void setDefaultValues() {
        this.engine = new Engine();
    }

    public void startEngine() {
        if (engine != null) {
            engine.start();
        } else {
            System.out.println("What? Start engine? I haven't engine!");
        }
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", engine=" + engine +
                '}';
    }
}

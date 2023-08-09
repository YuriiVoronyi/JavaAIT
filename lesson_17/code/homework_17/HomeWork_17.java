package homework_17;

public class HomeWork_17 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
        Создайте класс Phone, который содержит поля number, model и weight. Создайте три экземпляра этого класса.
        Выведите на консоль значения их полей. Добавить в класс Phone методы: receiveCall, имеет один параметр
        – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов. Добавить конструктор в класс Phone, который принимает на вход
        три параметра для инициализации полей класса - number, model и weight. Добавить конструктор, который принимает
        на вход два параметра для инициализации полей класса - number, model. Добавить конструктор без параметров.
        Вызвать из конструктора с тремя параметрами конструктор с двумя. Добавьте перегруженный метод receiveCall,
        который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
        */
        Phone phone1 = new Phone(123114547,"SONY", 300.25);
        Phone phone2 = new Phone(787878787,"NOKIA", 125.40);
        Phone phone3 = new Phone(565656555,"MOTOROLA", 250.10);
        System.out.println("Номер телефона1: " + phone1.number + ", модель телефона1: " + phone1.model + ", вес телефона1: " + phone1.weight + " грамм.");
        System.out.println("Номер телефона2: " + phone2.number + ", модель телефона2: " + phone2.model + ", вес телефона2: " + phone2.weight + " грамм.");
        System.out.println("Номер телефона3: " + phone3.number + ", модель телефона3: " + phone3.model + ", вес телефона3: " + phone3.weight + " грамм.");
        System.out.println("-----------------------------------------------------");
        System.out.println("На телефон1");
        phone1.receiveCall("Феликс");
        System.out.println("На телефон2");
        phone2.receiveCall("Лукас");
        System.out.println("На телефон3");
        phone3.receiveCall("Моника");
        System.out.println("-----------------------------------------------------");
        System.out.println("На телефон1");
        phone1.receiveCall("Феликс", 11111111);
        System.out.println("На телефон2");
        phone2.receiveCall("Лукас", 22222222);
        System.out.println("На телефон3");
        phone3.receiveCall("Моника", 33333333);

        System.out.println("************************** Task 1 ***********************************");
        /*
        Повторить код класса Dog, написанного на уроке. Создать массив из 10 препятствий.
        Попросить объект класса собака перепрыгнуть все препятствия в массиве.
        Посчитать сколько препятствий из массива собака смогла преодолеть.
        */
        Dog dog1 = new Dog("Barbos", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("=============");
        System.out.println("jumpHeight " + dog1.jumpHeight);
        System.out.println("maxJumpHeight " + dog1.maxJumpHeight);

        System.out.println("=========== Rax =============");
        Dog dog = new Dog("Rax", 150);

        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

        int[] barriers = {120, 180, 160, 280, 350, 50, 120, 310, 230, 250};

        int countVictory = 0;// Счетчик количества взятых барьеров
        for (int barrier: barriers) {
            countVictory += (dog.getBarrier(barrier)) ? 1 : 0;//Увеличиваем счетчик на 1 если барьер взят
        }
        if (countVictory == 0) {                           //Если ни один барьер не взят - выводим инфу
            System.out.println("Собака не смогла перепрыгнуть ни один барьер!");
        } else {
            System.out.println("Количество взятых барьеров равно: " + countVictory);
        }

    }
}

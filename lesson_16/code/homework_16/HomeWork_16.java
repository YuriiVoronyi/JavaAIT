package homework_16;
public class HomeWork_16 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
    /* Посмотрите вокруг себя. Напишите три класса, описывающие какие-то сущности вокруг Вас.
       Не забудьте использовать абстракцию. Например, опишите студента, преподавателя и,
       допустим, врача. Вы можете выбрать свои сущности для описания.*/
        Dog dogCooper = new Dog("Cooper","Dingo", "Black" );
        Bike bike = new Bike("Sport","Blue",5);
        Smartphone smPhone = new Smartphone("Sony","Android", "10x25");
        System.out.println("Dogs name is: " + dogCooper.dogsName);
        System.out.println("Breed of dog is: " + dogCooper.breedOfDog);
        System.out.println("Color of dog is: " + dogCooper.dogColor);
        dogCooper.bark();//Собака гавкает
        dogCooper.runn();//Собака бежит
        dogCooper.lie();//Собака легла
        dogCooper.sitDown();//Собака села
        System.out.println("***************************************************************");
        System.out.println("Type of bike is: " + bike.type);//Тип велосипеда
        System.out.println("Color of bike is: " + bike.color);//Цвет велосипеда
        System.out.println("Number of speed is: " + bike.numbersOfSpeed);//Количество скоростей у велика
        bike.riding();//Велосипед едет
        bike.switchingSpeed();//Велосипед переключает скорости
        bike.braking();//Велосипед тормозит
        System.out.println("***************************************************************");
        System.out.println("Smartphone manufacturer is: " + smPhone.companyManufacturer);//Фирма производитель
        System.out.println("Operating system is: " + smPhone.operatingSystem);//Операционная система
        System.out.println("Screen size is: " + smPhone.ScreenSize);//Размер экрана
        System.out.println("Смартфон звонит (к примеру будильник):");
        smPhone.bell();//
        System.out.println("Смартфон сделал фотку:");
        smPhone.photo();//
        System.out.println("Смартфон показал время:");
        smPhone.time();//
    }
}

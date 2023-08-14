package homework_20;

public class Main20 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rax", 100);
        System.out.println(dog.getName());
        System.out.println(dog.getJumpHeight());
        System.out.println(dog.getMaxJumpHeight());

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        RubberArrayV3 rubberArray = new RubberArrayV3(ints);
        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());
        rubberArray.add(14,18,20);
        rubberArray.printFullArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());
    }
}

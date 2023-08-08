package homework_16;

public class Dog {
    String dogsName;
    String breedOfDog;
    String dogColor;

    public Dog(String DogsName, String breedOfDog, String dogColor) {
        this.dogsName = DogsName;
        this.breedOfDog = breedOfDog;
        this.dogColor = dogColor;
    }

    public Dog(String DogsName, String breedOfDog) {
        this.dogsName = DogsName;
        this.breedOfDog = breedOfDog;
    }
    public Dog() {
    }
    void bark() {
        System.out.println("GAV!!!!!!!!!! GAV!!!!!!!!!!!!!!");//Собака гавкает
    }
    void sitDown() {
        System.out.println("The dog sat down");//Собака садится
    }
    void runn() {
        System.out.println("The dog running");//Собака бежит
    }
    void lie() {
        System.out.println("The dog lies");//Собака ложится
    }
}

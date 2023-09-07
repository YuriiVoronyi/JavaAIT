package homework_35;

public class Animals implements Comparable<Animals>{
    private String animalsName;
    private int animalsWeight;
    private String animalsColor;

    public Animals(String animalsName, int animalsWeight, String animalsColor) {
        this.animalsName = animalsName;
        this.animalsWeight = animalsWeight;
        this.animalsColor = animalsColor;
    }

    public String getAnimalsName() {
        return animalsName;
    }

    public int getAnimalsWeight() {
        return animalsWeight;
    }

    public String getAnimalsColor() {
        return animalsColor;
    }

    public int compareTo(Animals animal) {
        return this.animalsName.compareTo(animal.animalsName);
    }
    public String toString() {
        return animalsName + " " + animalsColor + " " + animalsWeight;
    }
}

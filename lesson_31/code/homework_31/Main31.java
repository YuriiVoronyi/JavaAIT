package homework_31;

public class Main31 {
    public static void main(String[] args) {
    /*
    Написать метод, который принимает строку и паттерн ( паттерн - это строка, из одной или больше букв)
    и возвращает количество вхождений паттерна в строку
    Пример: ( "Hello World", "l") -> 3
    */
    String text = "kjhgjhgkjgfgfkjhgfddkj";
    String pattern = "kj";
    System.out.println("Количество вхождений: " + numberOfPatterns(text,pattern));
    }
    public static int numberOfPatterns(String parText, String parPattern) {
        int counter = 0;
        int index = parText.length();
        while ((index = parText.lastIndexOf(parPattern,index)) != -1) {
            counter += 1;
            index -= parPattern.length();
        }
        return counter;
    }
}

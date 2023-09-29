package homework_53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainHW53 {
    /*
    Написать метод, читающий текстовый файл и возвращающий строку, состоящую из строчек этого файла.
    */
    public static void main(String[] args) {
        try {
            System.out.println(getInfoFromFile());
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
    public static String getInfoFromFile() throws IOException{
        StringBuilder txt = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("first.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                txt.append(str);
            }
        }
        return txt.toString();
    }
}

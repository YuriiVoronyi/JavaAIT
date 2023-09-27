package homework_51;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainHW51 {
    /* Написать программу, сравнивающую два файла . Программа должна считывать файлы и затем сравнивать содержимое.
       Если найдено отличие, значит файлы не равны и программа выводит на экрае соответствующее сообщение.
       Если конец обоих файлов достигается одновременно и отличий не найдено - значит файлы одинаковые и программа
       также выводит на экран соответствующее сообщение.
       Предварительно создать файлы в корневой директории first.txt, second.txt
     */
    public static void main(String[] args) {
        createMyFile("first.txt", "Hello world");
        createMyFile("second.txt","Hello world");
        String strRes = (getComparisonResult("first.txt","second.txt")) ? "" : "not ";
        System.out.println("These files are " + strRes + "equal");
    }
    public static void createMyFile(String nameOfFile, String parMess) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(nameOfFile)){
            byte[] buffer = parMess.getBytes();
            fileOutputStream.write(buffer,0,buffer.length);
            System.out.println("A file: " + nameOfFile + ", with the following text: \"" + parMess + "\" has been created.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean getComparisonResult(String parNamFile1, String parNamFile2) {
        try (FileInputStream fileInputStream1 = new FileInputStream(parNamFile1);
             FileInputStream fileInputStream2 = new FileInputStream(parNamFile2)){
            byte[] buffer1 = new byte[512];
            byte[] buffer2 = new byte[512];
            int counter1, counter2;
            while ((counter1 = fileInputStream1.read(buffer1)) != -1 && (counter2 = fileInputStream2.read(buffer2)) != -1) {
                if (counter1 != counter2) {
                    fileInputStream1.close();
                    fileInputStream2.close();
                    return false;
                } else {
                    for (int i = 0; i < counter1; i++) {
                        if(buffer1[i] != buffer2[i]) {
                            fileInputStream1.close();
                            fileInputStream2.close();
                            return false;
                        }
                    }
                }
            }
            fileInputStream1.close();
            fileInputStream2.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}

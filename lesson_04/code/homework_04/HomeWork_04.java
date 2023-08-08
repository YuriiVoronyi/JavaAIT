package homework_04;

public class HomeWork_04 {
    public static void main(String[] args) {

        System.out.println("*********************** Task 01 *****************************");

        /* Создайте переменную с типом String, в которой будет хранится ВАше имя.*/
        String myName = "Yurii";

        /*---- Сколько букв в вашем имени? Выведите значение на экран -----*/
        System.out.println("length " + myName.length());

        /* Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ */
        char firstChar = myName.charAt(0);
        char lastChar = myName.charAt(myName.length() - 1);
        System.out.println("firstChar " + firstChar);
        System.out.println("lastChar " + lastChar);

        /* Выведите на экран десятичный код первого и последнего символа вашего имени */
        int codeDecFirst = myName.codePointAt(0);
        int codeDecLast = myName.codePointAt(myName.length() - 1);
        System.out.println("codeDecFirst: " + codeDecFirst);
        System.out.println("codeDecLast:  " + codeDecLast);

        System.out.println("*********************** Task 02 *****************************");

        /* Создайте строки: Java, is, a, powerful, language */
        String strJava = "Java", strIs = "is", strA = "a", strPower = "powerful", strlan = "language";

        //Первый способ создания строки
        String strRez1 = strJava + " " + strIs + " " + strA + " " + strPower + " " + strlan;

        //Второй способ создания строки
        String strRez2 = String.join(" ","", strJava, strIs, strA, strPower, strlan);

        strRez1 = strRez1.trim();
        strRez2 = strRez2.trim();
        int strLange1 = strRez1.length();
        int strLange2 = strRez2.length();
        System.out.println("The first string is: " + strRez1 + ", the length of the first string is: "+strLange1);
        System.out.println("The second string is: " + strRez2 + ", the length of the second string is: "+strLange2);

        System.out.println("*********************** Task 02.2 *****************************");

        /* Заменить в результирующей строке слово "powerful" на "super" */

        System.out.println(strRez1.replace("powerful", "super"));

        /* Содержит ли строка подстроку "age"? */
        boolean rezBool = strRez1.contentEquals("age");
        System.out.println(rezBool);

        System.out.println("*********************** Task 03 *****************************");

        /* Необходимо распечатать два средних символа строк : string, code, Practice */
        String strString = "string", strCode = "code", strPractice = "Practice";

        String subString   = strString.substring(2, 4); // [2, 4)
        String subCode     = strCode.substring(1, 3); // [1, 3)
        String subPractice = strPractice.substring(3, 5); // [3, 5)

        System.out.println("subString : "+subString);
        System.out.println("subCode : "+subCode);
        System.out.println("subPractice : "+subPractice);

        System.out.println("*********************** Task 04 *****************************");

        /* Необходимо найти программно и распечатать два средних символа строк : string, code, Practice */
        String strString_ = "string", strCode_ = "code", strPractice_ = "Practice";

        int midOfLenString   = strString_.length()/2;
        int midOfLenCode     = strCode_.length()/2;
        int midOfLenPractice = strPractice_.length()/2;

        String subString_   = strString_.substring(midOfLenString-1, midOfLenString+1); // [2, 4)
        String subCode_     = strCode_.substring(midOfLenCode-1, midOfLenCode+1); // [1, 3)
        String subPractice_ = strPractice_.substring(midOfLenPractice-1, midOfLenPractice+1); // [3, 5)

        System.out.println("subString_ : "+subString_);
        System.out.println("subCode_ : "+subCode_);
        System.out.println("subPractice_ : "+subPractice_);
    }
}

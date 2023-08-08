package theory_04;

public class CharVariable {
    public static void main(String[] args) {
        char a = 'A'; // Переменная будет содержать англ букву A
        char c = 65; // Переменная будет содержать англ букву A, код 65 соответствует символу А
        char b = 0x41; // Переменная будет содержать англ букву A, т.е. 41 в 16-сист соответствует коду символа А
        b = 0x0041; // Переменная будет содержать англ букву A, т.е. 41 в 16-сист соответствует коду символа А
        char d = '\u0041';
        char e = '\u2019';

        System.out.println(a + " b: " + b + " c: " + c + " d: " + d);
        System.out.println(e);

        char ch = 'A';
        ch++; //ch = ch + 1;
        System.out.println(ch);

        ch = 97;
        System.out.println(ch);
        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;
//        x = x + y;
        x += y; // x = x + y;
//        *=, /=, -=, %=
        System.out.println(x);
        x %= y; // x = x % y;

        ch++; // ch = ch + 1;

        System.out.println(x);

        char ch1 = 12833;
        System.out.println(ch1);
    }
}

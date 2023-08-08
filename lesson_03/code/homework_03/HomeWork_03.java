package homework_03;

public class HomeWork_03 {
    public static void main(String[] args) {
        int a1 = 0, a2 = 1, a3 = 2, a4 = 3, a5 = 4, a6 = 5, a7 = 6, a8 = 7, a9 = 8, a10 = 9;
        int sum1 = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        int rez1 = sum1 / 10;
        System.out.println("================= Задача 1 ==========================");
        System.out.println( "Среднее значение : " + rez1 );  // целочисленное деление
        int rez2 = sum1 % 10;
        System.out.println( "Сколько программа отбросила в дробной части : " + rez2 ); // деление с остатком
        System.out.println("");

        System.out.println("================= Задача 2 ==========================");
        double tov_A = 1000.0d;
        double tov_B = 500.0d;
        double FullPrice = tov_A + tov_B; //Общая стоимость товаров А и В
        double Discount = (FullPrice * 10) / 100; //Сумма скидки 10% от покупки
        double FinalRrice = FullPrice - Discount;
        System.out.println("Стоимость товаров А и В с учетом скидки : "+FinalRrice);
        System.out.println("Сумма скидки 10% от покупки : "+Discount);
        System.out.println("");

        System.out.println("================= Задача 3 ==========================");
        double tmpr1 = 19.0d, tmpr2 = 17.0d, tmpr3 = 19.0d, tmpr4 = 22.0d, tmpr5 = 17.0d, tmpr6 = 19.0d, tmpr7 = 20.0d;
        double RezTmpr = (tmpr1 + tmpr2 + tmpr3 + tmpr4 + tmpr5 + tmpr6 + tmpr7) / 7;
        System.out.println("Средняя температура в Хайкендорфе за неделю : " + RezTmpr);
        System.out.println("");

        System.out.println("================= Задача 4 ==========================");
        int b1 = 1, b2 = 2, b3 = 3, b4 = 4, b5 = 5, b6 = 6, b7 = 7, b8 = 8, b9 = 9;
        int rb1 = b1 % 2, rb2 = b2 % 2, rb3 = b3 % 2, rb4 = b4 % 2, rb5 = b5 % 2;
        int rb6 = b6 % 2, rb7 = b7 % 2, rb8 = b8 % 2, rb9 = b9 % 2;
        // форматированный вывод делим на 2
        System.out.println("1%2 = "+rb1+", "+"2%2 = "+rb2+", "+"3%2 = "+rb3+", "+"4%2 = "+rb4+", "+"5%2 = "+rb5+", "+"6%2 = "+rb6+", "+"7%2 = "+rb7+", "+"8%2 = "+rb8+", "+"9%2 = "+rb9);
        int rb11 = b1 % 3, rb22 = b2 % 3, rb33 = b3 % 3, rb44 = b4 % 3, rb55 = b5 % 3;
        int rb66 = b6 % 3, rb77 = b7 % 3, rb88 = b8 % 3, rb99 = b9 % 3;
        // форматированный вывод делим на 3
        System.out.println("1%3 = "+rb11+", "+"2%3 = "+rb22+", "+"3%3 = "+rb33+", "+"4%3 = "+rb44+", "+"5%3 = "+rb55+", "+"6%3 = "+rb66+", "+"7%3 = "+rb77+", "+"8%3 = "+rb88+", "+"9%3 = "+rb99);
        System.out.println("");

        System.out.println("================= Задача 5 ==========================");
        int x = 3;
        int rez51 = x++;
        System.out.println("x++ = "+rez51);

    }
}

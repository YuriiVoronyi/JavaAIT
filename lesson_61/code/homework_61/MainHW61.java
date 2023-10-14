package homework_61;

import java.util.List;
import java.util.stream.Collectors;

public class MainHW61 {

    // 2. Есть класс BankAccount. Нужно написать метод, принимающий лист BankAccounts и
    // возвращающий лист IBANNs со звездочкой после третьего символа
    // DE4****************,DE5*******************,

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("DE71234562457854123");
        BankAccount acc2 = new BankAccount("DE43309569872309456");
        BankAccount acc3 = new BankAccount("DE98764250982734659");
        BankAccount acc4 = new BankAccount("DE08906578906598743");

        List<BankAccount> bankAccounts = List.of(acc1, acc2, acc3, acc4);
        System.out.println("======================= Variant 1");
        System.out.println(listOfIBANNs(bankAccounts));
        System.out.println("======================= Variant 2");
        System.out.println(listOfIBANNsVariant2(bankAccounts));
        System.out.println("======================= Variant 3");
        System.out.println(listOfIBANNsVariant3(bankAccounts));
    }
    public static List<String> listOfIBANNs(List<BankAccount> parIBANNs) {
        return parIBANNs.stream()
                .map(BankAccount -> BankAccount.getIBAN().substring(0,3).concat("****************"))
                .collect(Collectors.toList());
    }
    public static List<String> listOfIBANNsVariant2(List<BankAccount> parIBANNs) {
        return parIBANNs.stream()
                .map(BankAccount -> BankAccount.getIBAN().substring(0,3)
                        .concat("*".repeat(BankAccount.getIBAN().length()-3)))
                .collect(Collectors.toList());
    }
    public static List<String> listOfIBANNsVariant3(List<BankAccount> parIBANNs) {
        return parIBANNs
                .stream()
                .map(a -> replaceWithStars(a.getIBAN()))
                .collect(Collectors.toList());
    }
    private static String replaceWithStars(String parIBAN) {
        char[] chars = parIBAN.toCharArray();//Преобразуем строку в массив символов
        for (int i = 3; i < parIBAN.length(); i++) {
            chars[i] = '*';//заменяем элементы строки на * начиная с элемента под индексом равным 3
        }
        return new String(chars);//Преобразуем обратно массив символов в строку
    }
}

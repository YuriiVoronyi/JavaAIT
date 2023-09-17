package homework_44;
import java.util.*;

public class Main44 {
    public static void main(String[] args) {
        /*
        Есть класс автомобиль, в котором есть три поля: Марка, Модель, Цена.
        Написать метод, который принимает лист автомобилей, а возвращает TreeMap,
        ключами которого являются марки автомобилей, а значениями TreeSet
        автомобилей, в котором автомобили расположены в лексикографическом порядке
        относительно модели, причем дешевые вперед если модели одинаковые.
        public Map<String, Set<Auto>> autoByMake( List<Auto> autos)
        */

        Auto vw1 = new Auto("VW","Golf",25_000);
        Auto vw2 = new Auto("VW","Passat",35_000);
        Auto vw3 = new Auto("VW","Tiguan",30_000);

        Auto bmw1 = new Auto("BMW","3 Series",40_000);
        Auto bmw2 = new Auto("BMW","5 Series",65_000);
        Auto bmw3 = new Auto("BMW","5 Series",50_000);
        Auto bmw4 = new Auto("BMW","X5",65_000);

        Auto opl1 = new Auto("Opel","Corsa",15_000);
        Auto opl2 = new Auto("Opel","Astra",22_000);
        Auto opl3 = new Auto("Opel","Insignia",30_000);

        Auto audi1 = new Auto("Audi","A3",30_000);
        Auto audi2 = new Auto("Audi","A4",40_000);
        Auto audi3 = new Auto("Audi","Q5",45_000);

        Auto por1 = new Auto("Porsche","911",100_000);
        Auto por2 = new Auto("Porsche","Cayenne",70_000);
        Auto por3 = new Auto("Porsche","Macan",50_000);
        Auto por4 = new Auto("Porsche","Macan",20_000);

        List<Auto> autosList = new ArrayList<>();

        autosList.add(vw1);
        autosList.add(vw2);
        autosList.add(vw3);

        autosList.add(bmw1);
        autosList.add(bmw2);
        autosList.add(bmw3);
        autosList.add(bmw4);

        autosList.add(opl1);
        autosList.add(opl2);
        autosList.add(opl3);

        autosList.add(audi1);
        autosList.add(audi2);
        autosList.add(audi3);

        autosList.add(por1);
        autosList.add(por2);
        autosList.add(por3);
        autosList.add(por4);

        Map<String, Set<Auto>> treeMap = autoByMake(autosList);

        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
    public static Map<String, Set<Auto>> autoByMake(List<Auto> autosList) {
        TreeMap<String, Set<Auto>> treeMap = new TreeMap<>();
        for (Auto a : autosList) {
            String key = a.getCompanyMan();
            if (treeMap.containsKey(key)) {
                Set<Auto> setAuto = treeMap.get(key);
                setAuto.add(a);
                treeMap.put(key,setAuto);
            } else {
                Set<Auto> setAuto = new TreeSet<>();
                setAuto.add(a);
                treeMap.put(key,setAuto);
            }
        }
        return treeMap;
    }
}

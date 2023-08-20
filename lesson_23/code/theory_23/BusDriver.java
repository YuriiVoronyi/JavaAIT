package theory_23;
import java.util.Arrays;
public class BusDriver {
    private final int id;
    private String name;
    private String[] categories;
    private int age;

    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String category) {
    /*    String[] temp = new String[categories.length + 1];
        for (int i = 0; i < categories.length; i++){
            temp[i] = categories[i];
        }
        temp[temp.length - 1] = category;
        categories = temp;*/
        //Создаем копию массива донора categories с длиной на одну ячейку больше,
        //Пульту массива categories даем новую ссылку на его же копию с доп.ячейкой,
        //в которой по умолчанию стоит NULL, т.к. массив стрингов.
        categories = Arrays.copyOf(categories,categories.length + 1);
        //Заносим в последнюю ячейку массива значение параметра category
        categories[categories.length - 1] = category;
    }

    public boolean removeCategory(String category) {
        //1. Такая строка в массиве есть?
        //2. Нам нужен ее индекс
        //3. Непосредственно удаление из массива
        int idx = searchCategoryValue(category);
        if(idx == -1) return false;
        String[] temp = new String[categories.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if(i < idx){
                temp[i] = categories[i];
            } else {
                temp[i] = categories[i + 1];
            }
        }
        categories = temp;
        return true;
    }
    public void removeAllCategories(){
        categories = new String[0];
    }
    private int searchCategoryValue(String category) {
        if(category == null || category.length() == 0 || categories.length == 0) return -1;
        for(int i = 0; i < categories.length; i++) {
            if(category.equals(categories[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "{id:" + id + "; name: " + name +
                "; categories: " + Arrays.toString(categories) + "}";
    }

    // метод запускающий у водителя функцию "управление автобусом"
    // в параметры метода приходит ссылка
    // на конкретный автобус, которым управляет сейчас водитель
    public void driveBus(Bus bus) {
        System.out.println("Водитель id:" + id +
                " управляет автобусом id:" + bus.getId() + " " + bus.getModel());
    }
}

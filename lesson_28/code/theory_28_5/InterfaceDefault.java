package theory_28_5;

public interface InterfaceDefault {
    int getUserID();

    //  дефолтный метод создается с помощью ключевого слова default
    default int getAdminID(){
        return 25;
    }
}

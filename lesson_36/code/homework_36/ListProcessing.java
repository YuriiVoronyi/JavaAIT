package homework_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProcessing {
    public List<String> yesOrNo(List<Integer>list1, List<Integer>list2){
        List<String> resultYesNo = new ArrayList<>();
        for( int i = 0; i < list1.size(); i++){
            if( list1.get(i).equals(list2.get(i))) {
                resultYesNo.add("Yes");
            }
            else{ resultYesNo.add("No");}
        }
        return resultYesNo;
    }
    public List<Integer> withoutEltsMoreThanN( List<Integer> input, int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for( Integer i : input){
            if( i <= n){
                withoutMoreThan.add(i);
            }
        }
        return withoutMoreThan;
    }
    public List<Integer> withoutEltsMoteThanNIterator( List<Integer> input, int n){
        List<Integer> result = new ArrayList<>(input); // Создаем копию входного списка
        Iterator<Integer> iterator = result.iterator();
        while(iterator.hasNext()){
            if(iterator.next() >= n){
                iterator.remove();
            }
        }
        return result;
    }
}

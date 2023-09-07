package theory_35;

import java.util.Comparator;

public class ComparatorByNameThenId  implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int rez = e1.getFirstName().compareTo(e2.getFirstName());
        return (rez == 0) ? Integer.compare(e1.getId(),e2.getId()) : rez;
    }
}

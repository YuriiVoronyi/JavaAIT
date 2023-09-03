package homework_34;

import java.util.Comparator;
public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2){
        int rez = a1.getFirstName().compareTo(a2.getFirstName());
        return (rez == 0) ? Integer.compare(a1.getId(),a2.getId()) : rez;
    }
}

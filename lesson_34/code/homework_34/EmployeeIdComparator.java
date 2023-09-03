package homework_34;

import java.util.Comparator;
public class EmployeeIdComparator implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2){
        return Integer.compare(a1.getId(),a2.getId());
    }
}

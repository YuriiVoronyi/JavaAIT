package homework_34;

import homework_33.Animals;

import java.util.Arrays;

public class Main34 {
        /*
    Написать программу для бухгалтерии.
    Программа должна уметь:
    -добавлять сотрудников в штат
    -удалять сотрудников из штата
    -рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
     У программы должны быть следующие классы:
     - Company, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран списка
        всех сотрудников, и метод для суммирования зарплат всех сотрудников
     - классы сотрудников:
        -abstract Employee
        -WageEmployee
        -SalesManager
     У сотрудников  должны быть такие поля: id, имя, фамилия, количество проработанных часов. Также должен быть
     метод подсчета зарплаты
     У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
     минимальный размер оплаты труда
     У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж.
     Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда

     Дополнительно:
     Программа также должна содержать методы, предоставляющие возможность сортировки списка сотрудников
     по следующим критериям:
     - по фамилии
     - по id
     - по имени а если имена одинаковые, то по id
     */
        public static void main(String[] args) {
            Company company;
            Employee[] employees;//Массив сотрудников

            company = new Company(10);//Создаем компанию на 10 человек
            employees = new Employee[6];

            employees[0] = new SalesManager(1000,"Alan","Brown",160,7000,0.1);
            employees[1] = new SalesManager(1010,"Bob","Muller",160,5000,0.1);
            employees[2] = new SalesManager(1020,"Alan","Wilson",160,6500,0.1);
            employees[3] = new WageEmployee(1030,"Robert","Smith",150,14);
            employees[4] = new WageEmployee(1040,"David","Hall",130,15);
            employees[5] = new WageEmployee(1050,"William","Turner",140,16);

            for (int i = 0; i < employees.length; i++) {
                company.addEmployee(employees[i]);//Добавляем сотрудников в компанию
            }
            System.out.println("====== Display of company ============");
            company.display();
            System.out.println("\n======= Sort by last name ===========");
            Arrays.sort(employees);
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("\n======= Sort by name ===========");
            Arrays.sort(employees, new EmployeeNameComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("\n======= Sort by id ===========");
            Arrays.sort(employees, new EmployeeIdComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("\n======= Salary of employees ===========");
            for (Employee employee: employees) {
                System.out.println(employee + ", salary = " + employee.calculateSalary());
            }
            System.out.println("\n======= Add a new employee ===========");
            Employee e = new SalesManager(1060,"Lisa","White",160,5000,0.1);
            company.addEmployee(e);
            company.display();
            System.out.println("\n======= Delete an employee ===========");
            company.removeEmployee(employees[1]);
            company.display();
            System.out.println("\n======= Delete an employee again===========");
            company.removeEmployee(employees[5]);
            company.display();
        }
}

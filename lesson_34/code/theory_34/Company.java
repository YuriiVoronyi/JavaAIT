package theory_34;

public class Company {
    private Employee[] employees;//Массив сотрудников
    private int companySize;//Количество рабочих мест в компании

    public Company( int capacity){//Конструктор, передаем размер массива
        employees = new Employee[capacity];
        companySize = 0;//Пока никого на работу не приняли, пока весь массив заняти null-ями
    }

    public boolean addEmployee( Employee employee){
        if( companySize < employees.length){  //Если еще есть рабочие места
            employees[companySize] = employee;//добавляем объект сотрудник в массив сотрудников
            companySize++; //Для дальнейшего определения наличия раб.мест делаем инкремент флага
            return true;
        }
        return false;
    }

    public boolean removeEmployee( Employee employee){
        for( int i = 0; i < companySize; i++){//Перебираем всех сотрудников в массиве
          /*  if( employees[i].equals(employee)){
                employees[i] = employees[companySize - 1];
                companySize--;
                return true;
            }*/
            if( employees[i].equals(employee) ){//Если нашли того, кого нужно удалить
                if(i != companySize - 1){//Если он не стоит на последнем рабочем месте в массиве
                    employees[i] = employees[companySize - 1];//Последнего в массиве сотрудника ставим на место удаляемого
                }
                companySize--;//Уменьшаем количество занятых рабочих мест (размер компании)
                return true;
            }
        }
        return false;
    }

    public void display(){
        for( int i = 0; i < companySize;i++ ){
            System.out.println(employees[i]);
        }
    }
}

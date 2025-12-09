import java.util.HashSet;

public class EmployeeData {

HashSet<Employee> empset = new HashSet<>();

Employee emp1 = new Employee(1123,"Sugat Moon",23,"ASP Java Developer", "Production",26254);
Employee emp2 = new Employee(1124,"Sugat Moon",23,"ASP Java Developer", "Production",26254);
Employee emp3 = new Employee(1125,"Sugat Moon",23,"ASP Java Developer", "Production",26254);
Employee emp4 = new Employee(1126,"Sugat Moon",23,"ASP Java Developer", "Production",26254);
Employee emp5 = new Employee(1127,"Sugat Moon",23,"ASP Java Developer", "Production",26254);

public EmployeeData() {
    empset.add(emp1);
    empset.add(emp2);
    empset.add(emp3);
    empset.add(emp4);
    empset.add(emp5);
}  
    
}
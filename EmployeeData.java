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


//    View all Employee
    public void viewAll() {
        for (Employee inst : empset ){
            IO.println(inst);
        }
    }

// Adding Employee in the database

    public void add() {
        int indexId = Integer.parseInt(IO.readln("Enter the Index ID: "));
        String name = IO.readln("Enter the Name : ");
        int age = Integer.parseInt(IO.readln("Enter the Age: "));
        String designation = IO.readln("Enter the Designation: ");
        String dept = IO.readln("Enter the Department: ");
        int salary = Integer.parseInt(IO.readln("Enter the Salary: "));

        Employee new_emp = new Employee(indexId, name, age, designation, dept, salary);

        empset.add(new_emp);
        IO.print("New Employee Added Sucessfully!!!");
    }


    // Updataing Employee Details

        public void update() {
            int id = Integer.parseInt(IO.readln("Enter ID: "));

            for (Employee inst_emp : empset){
                if (inst_emp.getId() == id ) {
                    String name = IO.readln("Enter the Name : ");
                    int age = Integer.parseInt(IO.readln("Enter the Age: "));
                    String designation = IO.readln("Enter the Designation: ");
                    String dept = IO.readln("Enter the Department: ");
                    int salary = Integer.parseInt(IO.readln("Enter the Salary: "));


                    inst_emp.setAge(age);
                    inst_emp.setName(name);
                    inst_emp.setDept(dept);
                    inst_emp.setDesignation(designation);
                    inst_emp.setSalary(salary);

                    IO.println("Employee Update Sucessfully!!!!!");
                }

            }
        }

    // Delete Employee Details

    public void deleteEmp()  {

        int indexId = Integer.parseInt(IO.readln("Enter Employee Id :"));
        for(Employee inst_emp: empset) {
            if (inst_emp.getId() == indexId){
                empset.remove(inst_emp);
                IO.print("Delete Employee Sucessfully!!!!");
            }
        }
    }


}
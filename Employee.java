public class Employee {
    private int indexId;
    private String name;
    private int age;
    private String designation;
    private String dept;
    private double salary;


    public int getId() {
        return indexId;
    }
    public void setId(int indexId) {
        this.indexId = indexId;
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
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


// toString method Overrided
    @Override
    public String toString() {
        return "Employee [indexId=" + indexId + ", name=" + name + ", age=" + age + ", designation=" + designation
                + ", dept=" + dept + ", salary=" + salary + "]";
    }
    


    //Contructor of Employee
    public Employee(int indexId, String name, int age, String designation, String dept, double salary) {
        this.indexId = indexId;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.dept = dept;
        this.salary = salary;
    }
    


}

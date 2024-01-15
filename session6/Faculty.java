public class Faculty {
    private String name;
    private String department;
    private int salary;
    
    // constructor
    public Faculty(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    // getter method for name
    public String getName() {
        return name;
    }
    
    // setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // getter method for department
    public String getDepartment() {
        return department;
    }
    
    // setter method for department
    public void setDepartment(String department) {
        this.department = department;
    }
    
    // getter method for salary
    public int getSalary() {
        return salary;
    }
    
    // setter method for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    // toString method to display the object data
    @Override
    public String toString() {
        return "Faculty [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}
class Employee
{
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
 class Labour extends Employee
{
    public static final double overTime=0.5;
    public Labour(int employeeId,String employeeName, double salary)
    {
        super(employeeId,employeeName,salary);
    }
    public double getSalary()
    {
        return salary+salary*overTime;
    }

}
class Manager extends Employee
{
    public static final double incentive=0.5;
    public Manager(int employeeId,String employeeName, double salary)
    {
        super(employeeId,employeeName,salary);
    }
    public double getSalary()
    {
        return salary+salary*incentive;
    }
}
 class Main {
     public static void main(String args[]) {
         Manager m1 = new Manager(01, "M. Ravi", 30000);
         Manager m2 = new Manager(02, "M. Prem", 32000);
         Manager m3 = new Manager(03, "M. Suresh", 35000);
         Labour l1 = new Labour(1, "L. Dinesh", 15000);
         Labour l2 = new Labour(2, "L. Suresh", 16000);
         Labour l3 = new Labour(3, "L. Santhosh", 18000);
         System.out.println(l1.getSalary() + l2.getSalary() + l3.getSalary() + m1.getSalary() + m2.getSalary() + m3.getSalary());
     }
 }
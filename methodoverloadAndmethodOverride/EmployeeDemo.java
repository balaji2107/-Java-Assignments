package methodoverloadAndmethodOverride;

class Employee {
     static String companyName;
     String employeeId;
     String employeeName;
     String employeeEmail;
    public Employee(String employeeId, String employeeName, String employeeEmail) {
        companyName = "Private Limited";
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }


    public void getEmployeeDetails(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Email: "+employeeEmail);
    }
}
class HourlyEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
    public HourlyEmployee(String employeeId, String employeeName, String employeeEmail,double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, employeeEmail);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public double getSalary(){
        return hourlyRate*hoursWorked;
    }
    public void getEmployeeDetails(){
        System.out.println("----Hourly Employee Details----");
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Email: "+employeeEmail);
        System.out.println("Employee Salary: "+getSalary());
    }

}
class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(String employeeId, String employeeName, String employeeEmail,double salary) {
        super(employeeId, employeeName, employeeEmail);
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void getEmployeeDetails(){
        System.out.println("----Salaried Employee Details----");
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Email: "+employeeEmail);
        System.out.println("Employee Salary: "+getSalary());
    }

}
public class EmployeeDemo {
    public static void main(String[] args) {

        Employee h=new HourlyEmployee("20us10","bala","bala@gmail.com",60,4);
        Employee s=new SalariedEmployee("20us11","ram","ram@gmail.com",5000);
        h.getEmployeeDetails();
        s.getEmployeeDetails();
    }
}


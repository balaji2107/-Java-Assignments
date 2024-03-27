package classandobject;

public class Employee {
    private static String companyName;
    private String employeeId;
    private String employeeName;
    private String employeeEmail;

    public Employee(String employeeId, String employeeName, String employeeEmail) {
        companyName="Private Limited";
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public static String getCompanyName() {
        return companyName;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "CompanyName='" + companyName + '\'' +
                ",employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}

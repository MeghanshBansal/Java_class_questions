package Question;

import java.util.Objects;

public class Employee {
    int empId;
    String name;
    double salary;
    String emailId;

    public Employee(int empId, String name, double salary, String emailId) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.emailId = emailId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId() &&
                Double.compare(employee.getSalary(), getSalary()) == 0 &&
                getName().equals(employee.getName()) &&
                getEmailId().equals(employee.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getName(), getSalary(), getEmailId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}

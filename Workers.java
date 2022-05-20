
package oop;

import java.util.Objects;

public class Workers extends Person {
    private double salary;
    private String workNature, Department;

    public Workers() {
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkNature() {
        return workNature;
    }

    public void setWorkNature(String workNature) {
        this.workNature = workNature;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
public void PrintDetails()
{
    super.PrintDetails();
    System.out.println("\tSalary: "+this.salary+"\tWork Nature: "+this.workNature+"\tDepartment: "+this.Department);
}

    @Override
    public String toString() {
        return super.toString()+"\tSalary: " + salary + "\tWork Nature:" + workNature + "\tDepartment: " + Department ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Workers other = (Workers) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.workNature, other.workNature)) {
            return false;
        }
        if (!Objects.equals(this.Department, other.Department)) {
            return false;
        }
        return true;
    }
    
}

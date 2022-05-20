
package oop;

import java.util.Objects;

public class Technicians extends Person {
    private double salary;
    private String workNature;
    private String technical_specialization;

    public Technicians() {
        
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

    public String getTechnical_specialization() {
        return technical_specialization;
    }

    public void setTechnical_specialization(String technical_specialization) {
        this.technical_specialization = technical_specialization;
    }
    
    public void PrintDetails()
{
    super.PrintDetails();
    System.out.println("\tSalary: "+this.salary+"\tWork Nature: "+this.workNature+"\tTechnical Specialization: "+this.technical_specialization);
}

    @Override
    public String toString() {
        return super.toString()+ "\tSalary: " + salary + "\tWork Nature: " + workNature + "\tTechnical Specialization: " + technical_specialization ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Technicians other = (Technicians) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.workNature, other.workNature)) {
            return false;
        }
        if (!Objects.equals(this.technical_specialization, other.technical_specialization)) {
            return false;
        }
        return true;
    }
    
}

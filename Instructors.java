package oop;

import java.util.ArrayList;
import java.util.Objects;

public class Instructors extends Person {

    private double salary;
    private String Scientific_degree;
    private String subject_name;

    public Instructors() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getScientific_degree() {
        return Scientific_degree;
    }

    public void setScientific_degree(String Scientific_degree) {
        this.Scientific_degree = Scientific_degree;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public void PrintDetails() {
        super.PrintDetails();
        System.out.println("\tSalary: " + this.salary + "\tScientific Degree: " + this.Scientific_degree + "\tSubject Name: " + this.subject_name);
    }

    @Override
    public String toString() {
        return super.toString() + "\tSalary: " + salary + "\tScientific Degree: " + Scientific_degree + "\tSubject Name: " + subject_name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructors other = (Instructors) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.Scientific_degree, other.Scientific_degree)) {
            return false;
        }
        if (!Objects.equals(this.subject_name, other.subject_name)) {
            return false;
        }
        return true;
    }

}

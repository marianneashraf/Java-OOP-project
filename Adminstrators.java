
package oop;

import java.util.Objects;

public class Adminstrators extends Person {
   private double salary;
    String adminstrate_section;

    public Adminstrators() {
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAdminstrate_section() {
        return adminstrate_section;
    }

    public void setAdminstrate_section(String adminstrate_section) {
        this.adminstrate_section = adminstrate_section;
    }
    public void PrintDetails()
{
    super.PrintDetails();
    System.out.println("\tSalary: "+this.salary+"\tAdminstrate Section: "+this.adminstrate_section);
}

    @Override
    public String toString() {
        return super.toString()+"\tSalary: " + salary + "\tAdminstrate Section: " + adminstrate_section ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Adminstrators other = (Adminstrators) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.adminstrate_section, other.adminstrate_section)) {
            return false;
        }
        return true;
    }
    
}


package oop;

import java.util.Objects;


public class Students extends Person {
     private int level;
     private double gpa;
     private String Specialization;
 

    public Students() 
    {
        
    }
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

   
   
     public void PrintDetails()
     {
         super.PrintDetails();
         System.out.println("\tLevel: "+this.level+"\tSpecialization: "+this.Specialization+"\tGPA: "+this.gpa);
     }

    @Override
    public String toString() {
        
        return super.toString()+ "\tLevel: " + level + "\tGPA: " + gpa + "\tSpecialization: " + Specialization ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Students other = (Students) obj;
        if (this.level != other.level) {
            return false;
        }
        if (Double.doubleToLongBits(this.gpa) != Double.doubleToLongBits(other.gpa)) {
            return false;
        }
        if (!Objects.equals(this.Specialization, other.Specialization)) {
            return false;
        }
        return true;
    }
}


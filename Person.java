package oop;

import java.util.Objects;

public abstract class Person implements PrintClass {

    private String namef, namel, email;
    private int age, id;
    private long phonenum;
    private String gender;

    Address a = new Address();

    public Person() {

    }

    public String getNamef() {
        return namef;
    }

    public void setNamef(String namef) {
        this.namef = namef;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void PrintDetails() {
        System.out.print("ID: " + this.id + "\tName: " + this.namef + " " + this.namel + "\tAge: " + this.age + "\tGender: " + this.gender + "\tPhone Number: " + this.phonenum + "\tAddress: " + this.a.getCity() + " " + a.getStreetName() + "\tEmail: " + this.email);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tName: " + namef + " " + namel + "\tE-mail: " + email + "\tAge: " + age + "\t  Phone Number: " + phonenum + "\tGender: " + gender + "\tAddress:" + a.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.namef, other.namef)) {
            return false;
        }
        if (!Objects.equals(this.namel, other.namel)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.phonenum != other.phonenum) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.a, other.a)) {
            return false;
        }
        return true;
    }

}

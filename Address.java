package oop;

public class Address {

    private String city;
    private String streetName;

    public Address() {

    }

    public String toString() {
        return city + " " + streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

}

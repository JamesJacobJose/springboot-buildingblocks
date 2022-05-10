package com.stacksimplify.restservices.springbootbuildingblocks.Hello;

public class UserDetails {

    private String firstname;
    private String lastname;
    private String city;

    //Fields Constructor
    public UserDetails(String firstname, String lastname, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    //Getters and Setters
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //toString

    @Override
    public String toString() {
        return "{" +
            " firstname='" + getFirstname() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", city='" + getCity() + "'" +
            "}";
    }

    
}

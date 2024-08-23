package com.example.application.views.empty;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String value, String value1) {
        this.firstName = value;
        this.lastName = value1;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

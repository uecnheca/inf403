package ru.itis.itis1.model;

public class Person {
    protected String lastName;
    protected String middleName;
    protected String firstName;
    protected int age;

    public Person() {

    }

    public Person(String lastName, String middleName, String firstName, int age) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + age;
    }
}

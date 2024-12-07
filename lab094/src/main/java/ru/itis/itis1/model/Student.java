package ru.itis.itis1.model;

public class Student extends Person {
    private Person person;
    private String grouppName;
    private int rating;

    public Student() {
    }

    public Student(String lastName, String firstName, String middleName, int age, String grouppName, int rating) {
        super(lastName, firstName, middleName, age);
        this.grouppName = grouppName;
        this.rating = rating;

    }

    public Person getPerson() {
        return person;
    }

    public String getGrouppName() {
        return grouppName;
    }

    public int getRating() {
        return rating;
    }

    public void setGrouppName(String grouppName) {
        this.grouppName = grouppName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + age + ", " + grouppName + ", " + rating;
    }
}

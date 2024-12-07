package ru.itis.itis1.model;

public class Teacher extends Person {
    private Person person;
    private String[] disciplines;

    public Teacher(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }
    public Person getPerson() {
        return person;
    }

    public String[] getDisciplines() {
        return disciplines;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }
    public String toString() {
        return "Mr.Prof " + lastName + " " + firstName + " " + middleName + ", " + age;
    }
}


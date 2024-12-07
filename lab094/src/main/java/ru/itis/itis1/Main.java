package ru.itis.itis1;

import ru.itis.itis1.model.Person;
import ru.itis.itis1.model.Student;
import ru.itis.itis1.model.Teacher;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Student person = new Student("Петров", "Петр", "Петрович", 19, "11-403", 5);
        System.out.println(person);
    }
}

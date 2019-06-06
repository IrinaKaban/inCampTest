package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    ArrayList<Student> internship = new ArrayList<Student>();
    University university;

    public Internship(String name, University university) {
        setInternship(name);
        this.university = university;
    }

    public void setInternship(String name) {
        this.name = name;
    }
}

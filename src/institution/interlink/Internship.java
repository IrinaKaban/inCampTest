package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    ArrayList<Student> internship = new ArrayList<Student>();
    University university;

    public Internship(String name, University university) throws Exception {
        setInternship(name);
        this.university = university;
    }

    public void setInternship(String name) throws Exception {
        if(name.equals("")) throw new Exception("Не вказана назва");
        this.name = name;
    }

    public void addStudents() {
        ArrayList<Student> students = university.getUniversityStudent();
        for(Student student : students) {
            if(student.getKnowledge().getLevel() > university.getKnowledge())
                internship.add(student);
        }
    }

    public String getStudents() {
        String listOfStudent = "";

        for(Student student : internship) {
            listOfStudent += student.getName();
            listOfStudent += "\n";
        };

        return listOfStudent;
    }
}

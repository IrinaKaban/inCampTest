package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) throws Exception {
        setUniversity(name);
    }

    private void setUniversity(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getUniversityStudent() {
        return students;
    }
}

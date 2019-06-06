package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) throws Exception {
        setUniversity(name);
    }

    private void setUniversity(String name) throws Exception {
        if(name.equals("")) throw new Exception("Не вказана назва університета");
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getUniversityStudent() {
        return students;
    }

    public float getKnowledge() {
        float sum = 0;

        for(Student student : students)
            sum += student.getKnowledge().getLevel();

        return sum / students.size();
    }
}

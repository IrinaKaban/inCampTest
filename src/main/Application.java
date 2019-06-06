package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) throws Exception {
        University chpt = new University("CH.P.T.");

        chpt.addStudent(new Student("Andrew Kostenko", new Knowledge(5)));
        chpt.addStudent(new Student("Julia Veselkina", new Knowledge(8)));
        chpt.addStudent(new Student("Maria Perechrest", new Knowledge(7)));
        chpt.addStudent(new Student("Trevor Porter", new Knowledge(7)));
        chpt.addStudent(new Student("Joan Potter", new Knowledge(3)));
        chpt.addStudent(new Student("Prudence Brooks", new Knowledge(1)));
        chpt.addStudent(new Student("William Stark", new Knowledge(4)));

        Internship internship = new Internship("Interlink", chpt);
        internship.addStudents();
        
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}

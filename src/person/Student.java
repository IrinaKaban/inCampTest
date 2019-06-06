package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, Knowledge knowledge) throws Exception {
        setName(name);
        this.knowledge = knowledge;
    }

    private void setName(String name) throws Exception {
        if(name.equals("")) throw new Exception("Не вказане ім'я студента");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }
}

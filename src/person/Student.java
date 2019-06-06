package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, Knowledge knowledge) {
        setName(name);
        this.knowledge = knowledge;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }
}

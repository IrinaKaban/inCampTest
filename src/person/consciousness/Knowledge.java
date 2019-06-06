package person.consciousness;

public class Knowledge {
    private float level;

    public Knowledge(float level) throws Exception {
        setLevel(level);
    }

    private void setLevel(float level) throws Exception {
        if(level < 0) throw new Exception("Не вказаний рівень знань");
        this.level = level;
    }

    public float getLevel() {
        return level;
    }
}

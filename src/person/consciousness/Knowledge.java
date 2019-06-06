package person.consciousness;

public class Knowledge {
    private float level;

    public Knowledge(float level) throws Exception {
        setLevel(level);
    }

    private void setLevel(float level) throws Exception {
        if(level == 0) throw new Exception("Не вказаний рівень знань");
        if(level < 0) throw new Exception("Рівень знань не може бути менший нуля");
        this.level = level;
    }

    public float getLevel() {
        return level;
    }
}

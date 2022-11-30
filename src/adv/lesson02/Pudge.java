package adv.lesson02;

import java.io.Serializable;

public class Pudge implements Serializable {


    private static final long serialVersionUID = 5021054559146505595L;
    private String  name;
    private int level;

    public Pudge() {
    }

    public Pudge(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pudge{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}

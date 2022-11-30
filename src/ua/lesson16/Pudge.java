package ua.lesson16;

public class Pudge {
    private int id;
    private  String name;
    private String ultimate;
    private int level;

    public Pudge(int id, String name, String ultimate, int level) {
        this.id = id;
        this.name = name;
        this.ultimate = ultimate;
        this.level = level;
    }

    public Pudge(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", ultimate='" + ultimate + '\'' +
                ", level=" + level +
                '}';
    }
}

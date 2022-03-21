package week21studysession;

public class Module {
    private String name;
    private int score;

    public Module(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

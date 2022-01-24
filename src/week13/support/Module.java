package week13.support;

public class Module {
    private String moduleName, moduleCode, moduleTutor;
    private double score;

    public Module(String moduleName, String moduleCode, String moduleTutor) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.moduleTutor = moduleTutor;
    }

    public void setScore(double score) {
        if(score > 0 && score <= 100){
            this.score = score;
        }else{
            System.out.println("Score must be greater than zero");
        }
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleName='" + moduleName + '\'' +
                ", moduleCode='" + moduleCode + '\'' +
                ", moduleTutor='" + moduleTutor + '\'' +
                ", score=" + score +
                '}';
    }
}

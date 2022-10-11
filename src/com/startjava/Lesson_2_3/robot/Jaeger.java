public class Jaeger {
    
    private String modelName;
    private String mark;
    private int kaijuKilled;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.kaijuKilled = kaijuKilled;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}
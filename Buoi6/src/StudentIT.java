public class StudentIT extends Student{
    private double htmlScore;
    private double cssScore;
    private double javaScore;

    public StudentIT(String name, String major, double htmlScore, double cssScore, double javaScore) {
        super(name, major);
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javaScore = javaScore;
    }

    @Override
    public double getScore() {
        return ((htmlScore+cssScore+2*javaScore)/4);
    }
}

public class StudentBiz extends Student{
    private double marketingScore;
    private double saleScore;

    public StudentBiz(String name, String major, double marketingScore, double saleScore) {
        super(name, major);
        this.marketingScore = marketingScore;
        this.saleScore = saleScore;
    }

    @Override
    public double getScore() {
        return ((2*marketingScore+saleScore)/3);
    }
}

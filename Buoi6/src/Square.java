public class Square extends Retangle{

    public Square(double height, double wight) {
        super(height, wight);
    }

    @Override
    public void show() {
        System.out.println("Chu vi hv: "+super.getChuVi()+" S= "+super.getDientich());
    }
}

public class Retangle {
    private double height;
    private double wight;

    public Retangle(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    public double getChuVi(){
        System.out.println("Chu vi hcn: "+((height+wight)*2));
        return (height+wight)*2;
    }

    public double getDientich(){
        System.out.println("S= "+(height*wight));
        return (height*wight);
    }

    public void show(){
        System.out.println("Height: "+height +" - wight:"+wight+" C= "+getChuVi()+" S="+getDientich());
    }
}

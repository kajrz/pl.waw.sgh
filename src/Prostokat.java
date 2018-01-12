public class Prostokat extends Figura {

    protected double parB;

    public Prostokat(double parA, double parB) {
        super(parA);
        this.parB = parB;
    }

    @Override
    public double policzPole() {
        return parA*parB;
    }

    @Override
    public void komunikat() {
        System.out.println("Prostokąt o wymiarach: " + this.parA + "x" + this.parB + " ma pole powierzchni równe " + this.policzPole());
    }

}

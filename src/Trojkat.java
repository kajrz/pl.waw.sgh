public class Trojkat extends Figura {

    protected double parB;

    public Trojkat(double parA, double parB) {
        super(parA);
        this.parB = parB;
    }

    @Override
    public double policzPole() {
        return 0.5*parA*parB;
    }

    @Override
    public void komunikat() {
        System.out.println("Trójkąt o podstawie: " + this.parA + " i wysokości: " + this.parB + " ma pole powierzchni równe " + this.policzPole());
    }

}
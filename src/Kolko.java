public class Kolko extends Figura {
    public Kolko(double parA) {
        super(parA);
    }

    @Override
    public double policzPole() {
        return Math.PI*Math.pow(parA,2);
    }

    @Override
    public void komunikat() {
        System.out.println("Koło o promieniu: " + this.parA+ " ma pole powierzchni równe " + this.policzPole());
    }

}

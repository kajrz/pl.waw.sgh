public class Kwadrat extends Figura {
    public Kwadrat(double parA) {
        super(parA);
        ustawParam(parA);
    }

    @Override
    public double policzPole() {
        return parA*parA;
    }

    @Override
    public void komunikat() {
        System.out.println("Kwadrat o boku: " + this.parA + " ma pole powierzchni równe " + this.policzPole());
    }

}

public abstract class Figura {

    protected double parA;
    //protected double parB;

    public Figura(double parA/*, double parB*/) {
        ustawParam(parA/*, parB*/);
    }

    public void ustawParam(double parA/*, double parB*/) {
        this.parA = parA;
        /*this.parB = parB;*/
    }

    public abstract double policzPole();

    public abstract void komunikat();
}

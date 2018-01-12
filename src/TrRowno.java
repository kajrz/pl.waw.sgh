public class TrRowno extends Figura {
    public TrRowno(double parA) {
        super(parA);
    }

    @Override
    public double policzPole() {
        return Math.sqrt(3)*Math.pow(parA,2)/4;
    }

    @Override
    public void komunikat() {
        System.out.println("Trójkąt równoboczny o boku: " + this.parA+ " ma pole powierzchni równe " + this.policzPole());
    }

}

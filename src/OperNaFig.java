public class OperNaFig {

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(24,5);
        Kolko k1 = new Kolko(3);
        TrRowno tr1 = new TrRowno(4);
        Trojkat t1 = new Trojkat(8,2);
        Kwadrat k2 = new Kwadrat(4);
        Figura[] tabFig = new Figura[5];
        tabFig[0] = p1;
        tabFig[1] = k1;
        tabFig[2] = tr1;
        tabFig[3] = t1;
        tabFig[4] = k2;

        for (Figura f : tabFig) {
            f.policzPole();
            f.komunikat();
        }
    }
}
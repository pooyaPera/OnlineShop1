public class Warenkorb {

    private double betrag;

    public void kaufen(Artikel a){
        betrag += a.getPreis();
    }
    public double getBetrag(){
        return betrag;
    }
    public double rechnung(){
        System.out.println(betrag);
        betrag = 0.0;
        return betrag;
    }
}

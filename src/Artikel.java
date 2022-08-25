public class Artikel {

    private String bez;
    private int artikelnum;
    private double preis;

    public Artikel (String bez, int artikelnum, double preis){
        this.bez = bez;
        this.artikelnum= artikelnum;
        this.preis = preis;
    }

    public String getBez(){
        return bez;
    }
    public int getArtikelnum(){
        return artikelnum;
    }
    public double getPreis(){
        return preis;
    }
}

public class Warenkorb {

    private double betrag;
    private int limit = 8;
    private int anzahl;
    private String[] arr = new String[limit];

    public void kaufen(Artikel a){
        betrag += a.getPreis();
        anzahl++;

        arr[anzahl-1] = a.getBez();

    }


    public double getBetrag(){
        return betrag;
    }
    public double rechnung(){
        System.out.println(betrag);
        betrag = 0.0;
        arr = new String[arr.length];
        return betrag;
    }

    public void getList(){
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

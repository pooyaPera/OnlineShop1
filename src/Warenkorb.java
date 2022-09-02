import java.lang.reflect.Array;
import java.util.Arrays;

public class Warenkorb {

    private double betrag;
    private int limit = 8;
    private int anzahl;
    private String[] arr = new String[limit];

    public void kaufen(Artikel a){
        betrag += a.getPreis();
        anzahl++;
        if (anzahl<betrag){arr[anzahl-1] = a.getBez();}else {
            System.out.println("array is full");
        }

    }


    public double getBetrag(){
        return betrag;
    }
    public double rechnung(){
        betrag = 0.0;
        arr = new String[arr.length];
        return betrag;
    }

    public void getList(){
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void loeschen(String x){
        String[] copy = new String[arr.length-1];
        int k =0;

        for (int i = 0;i< arr.length; i++){
            if (arr[i] != x){
                copy[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(copy));

    }
}

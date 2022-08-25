public class Main {
    public static void main(String[] args) {

        Artikel a1 = new Artikel("apple", 1,5.00);
        Artikel a2 = new Artikel("pear", 2,6.00);
        Artikel a3 = new Artikel("peach", 3,1.00);

        Warenkorb warenkorb = new Warenkorb();

        warenkorb.kaufen(a1);
        warenkorb.kaufen(a2);
        warenkorb.rechnung();
        System.out.println(warenkorb.getBetrag());
        warenkorb.kaufen(a3);
        warenkorb.kaufen(a2);
        warenkorb.rechnung();
    }
}

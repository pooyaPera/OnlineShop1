public class Main {
    public static void main(String[] args) {

        Artikel a1 = new Artikel("apple", 1,5.00);
        Artikel a2 = new Artikel("pear", 2,6.00);
        Artikel a3 = new Artikel("peach", 3,1.00);
        Artikel a4 = new Artikel("orange", 4,1.00);
        Artikel a5 = new Artikel("potato", 5,1.00);
        Artikel a6 = new Artikel("salmon", 6,1.00);
        Artikel a7 = new Artikel("tomato", 7,1.00);
        Artikel a8 = new Artikel("kiwi", 8,1.00);
        Artikel a9 = new Artikel("banana", 9,1.00);

        Warenkorb warenkorb = new Warenkorb();

        warenkorb.kaufen(a1);
        warenkorb.kaufen(a2);
        warenkorb.kaufen(a3);
        warenkorb.kaufen(a4);
        warenkorb.kaufen(a5);
        //warenkorb.rechnung();
        warenkorb.kaufen(a6);
        warenkorb.kaufen(a7);
        warenkorb.kaufen(a8);
        warenkorb.getList();
        warenkorb.loeschen("potato");





    }
}

public class TablicaLiczb {
    private int n;
    private Liczba[] tablica;


    public TablicaLiczb(int dlugosc) {
        n = dlugosc;

        tablica = new Liczba[n];

    }

    public void wypelnienie() {

        for (int i = 0; i < n; i++) {
            tablica[i] = new Liczba();
        }
    }

    public void wypisanie() {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + tablica[i].getliczba());


        }
    }


    public void wypfib(){

        System.out.println ("Fibonacci Numbers: ");
        for (int i = 0; i < n; i++) {
            tablica[i].czyfib (); {
            }

        }

    }

}

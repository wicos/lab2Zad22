public class Main {
    public static void main(String[] args) {

        Liczba nowaliczba = new Liczba();
        System.out.println(nowaliczba.getliczba());

        nowaliczba.czyfib();

        TablicaLiczb nowatablica = new TablicaLiczb (20);
        nowatablica.wypelnienie ();
        nowatablica.wypisanie ();
        nowatablica.wypfib();


    }
}
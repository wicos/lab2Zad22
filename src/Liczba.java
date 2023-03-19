public class Liczba {
    private int a;
    private int b;
    private int rand;


    public Liczba() {
        a = 1;
        b = 100;
        rand = (int) Math.floor(Math.random() * (b - a + 1) + a);
    }

    public Liczba(int a, int b) {
        this.a = a;
        this.b = b;
        rand = (int) Math.floor(Math.random() * (b - a + 1) + a);


    }

    public int getliczba() {
        return rand;
    }


    public void czyfib() {
        int[] fibtab = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        for (int i = 0; i < 11; i++) {
            if (rand == fibtab[i]) {
                System.out.println(fibtab[i]);
            }
        }

    }
}
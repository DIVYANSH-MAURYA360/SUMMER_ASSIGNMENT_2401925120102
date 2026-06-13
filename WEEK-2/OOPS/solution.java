package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        // a. Instance of Veena
        Veena veena = new Veena();
        veena.play();

        // b. Instance of Saxophone
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Polymorphism via Playable reference
        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();
    }
}

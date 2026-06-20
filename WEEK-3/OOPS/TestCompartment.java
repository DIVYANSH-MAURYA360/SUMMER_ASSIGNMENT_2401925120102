import compartment.*;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] coaches = new Compartment[10];
        Random rand = new Random();

        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║           INDIAN RAILWAYS - TRAIN COACH ASSIGNMENT           ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝\n");

        for (int i = 0; i < coaches.length; i++) {
            int type = rand.nextInt(4) + 1;  // 1 to 4

            switch (type) {
                case 1 -> coaches[i] = new FirstClass();
                case 2 -> coaches[i] = new Ladies();
                case 3 -> coaches[i] = new General();
                case 4 -> coaches[i] = new Luggage();
            }
        }

        for (int i = 0; i < coaches.length; i++) {
            System.out.println("Coach [" + (i + 1) + "] → " + coaches[i].getClass().getSimpleName());
            System.out.println("Notice: " + coaches[i].notice());
            System.out.println("──────────────────────────────────────────────────────────────");
        }
    }
}

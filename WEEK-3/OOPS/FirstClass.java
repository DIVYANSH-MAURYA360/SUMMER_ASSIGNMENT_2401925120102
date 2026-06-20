package compartment;

public class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "FIRST CLASS COACH: Only passengers with valid First Class tickets are permitted. " +
               "Air-conditioned. Unauthorized entry is strictly prohibited.";
    }
}

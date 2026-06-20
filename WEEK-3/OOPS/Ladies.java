package compartment;

public class Ladies extends Compartment {
    @Override
    public String notice() {
        return "LADIES COACH: Reserved exclusively for female passengers. " +
               "Male passengers are not allowed to travel in this compartment.";
    }
}

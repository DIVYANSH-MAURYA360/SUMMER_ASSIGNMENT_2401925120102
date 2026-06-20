package compartment;

public class Luggage extends Compartment {
    @Override
    public String notice() {
        return "LUGGAGE VAN: This compartment is reserved for cargo and luggage only. " +
               "No passengers are allowed. Perishables and hazardous materials are prohibited.";
    }
}

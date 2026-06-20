package compartment;

public class General extends Compartment {
    @Override
    public String notice() {
        return "GENERAL COACH: Open to all passengers with a valid train ticket. " +
               "Please offer your seat to senior citizens, differently-abled, and pregnant women.";
    }
}

package phone;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return getVersionNumber() + " says " + getRingTone();

    }

    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }

    @Override
    public void displayInfo() {
        System.err.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
    }
}

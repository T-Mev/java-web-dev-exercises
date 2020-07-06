package exercises.technology;

public class SmartPhone extends Computer {

    private String phoneCarrier;
    private Boolean displayOn = false;

    public SmartPhone(String brand, int ram, String processor, int storage, String phoneCarrier) {
        super(brand, ram, processor, storage);
        this.phoneCarrier = phoneCarrier;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public void setPhoneCarrier(String phoneCarrier) {
        this.phoneCarrier = phoneCarrier;
    }

    public String isDisplayOn() {
        return displayOn ? "Display: [ON]":"Display: [OFF]";
    }

    public Boolean turnOnDisplay() {
        return displayOn = true;
    }

    public Boolean turnOffDisplay() {
        return displayOn = false;
    }

    public String makeCall(String name) {
        return "Calling... " + name;
    }

    public String smartSearch(String searchTerm) {
        return "Searching for: " + "'" + searchTerm + "'" +
                " Found: 200 results.";
    }

    @Override
    public String toString() {
        return "Device ID#: " + this.getId() + '\n' +
                "Brand: " + this.getBrand() + '\n' +
                "Ram: " + this.getRam() + "GB" + '\n' +
                "Processor: " + this.getProcessor() + '\n' +
                "Internal Storage: " + this.getStorage() + "GB" + '\n' +
                "Phone Carrier: " + phoneCarrier + '\n';
    }

}

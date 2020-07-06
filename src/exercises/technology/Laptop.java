package exercises.technology;

public class Laptop extends Computer {

    private int batteryLife;
    private Boolean lidClosed = true;

    public Laptop(String brand, int ram, String processor, int storage, int batteryLife) {
        super(brand, ram, processor, storage);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String isLidClosed() {
        return lidClosed ? "Lid is closed.":"Lid is open.";
    }

    public Boolean openLid() {
        return lidClosed = false;
    }

    public Boolean closeLid() {
        return lidClosed = true;
    }

    public String screenMirroring(){
        return "Connecting to TV...\n" +
                " ...\n" + " ...\n" + "Connection successful!";
    }

    @Override
    public String toString() {
        return "Device ID#: " + this.getId() + '\n' +
                "Brand: " + this.getBrand() + '\n' +
                "Ram: " + this.getRam() + "GB" + '\n' +
                "Processor: " + this.getProcessor() + '\n' +
                "Internal Storage: " + this.getStorage() + "GB" + '\n' +
                "Battery Life: " + batteryLife + " Hours" + '\n';
    }

}

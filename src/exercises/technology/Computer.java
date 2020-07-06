package exercises.technology;

public class Computer extends AbstractEntity{

    private String brand;
    private int ram;
    private String processor;
    private int storage;
    private Boolean hasPower = false;

    public Computer(String brand, int ram, String processor, int storage) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String hasPower() {
        return hasPower ? "Power: [ON]":"Power: [OFF]";
    }

    public Boolean turnOn() {
        return hasPower = true;
    }

    public Boolean turnOff() {
        return hasPower = false;
    }

    public String sendToPrinter(String document) {
        return "'" + document + "'" + " has been sent to the printer.";
    }

    @Override
    public String toString() {
        return "Device ID#: " + this.getId() + '\n' +
                "Brand: " + brand + '\n' +
                "Ram: " + ram + "GB" + '\n' +
                "Processor: " + processor + '\n' +
                "Storage: " + storage + "GB" + '\n';
    }

}

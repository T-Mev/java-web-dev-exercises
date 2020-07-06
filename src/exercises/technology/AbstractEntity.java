package exercises.technology;

public abstract class AbstractEntity {

    private static int deviceId = 0;

    public AbstractEntity() {
        deviceId++;
    }

    public int getId() {
        return deviceId;
    }

}

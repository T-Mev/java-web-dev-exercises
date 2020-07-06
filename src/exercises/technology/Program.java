package exercises.technology;

public class Program {
    public static void main(String[] args) {

        //    Trying computer class
        Computer myPc = new Computer("HP",16, "AMD Ryzen 7 3700X", 1000);
        System.out.println("***My PC***\n" + myPc);
        System.out.println("➤ Is it on?\n" + myPc.hasPower());
        myPc.turnOn();
        System.out.println("➤ Turn On\n" + myPc.hasPower());
        myPc.turnOff();
        System.out.println("➤ Turn Off\n" + myPc.hasPower());
        System.out.println("➤ Printing:");
        System.out.println(myPc.sendToPrinter("word.txt"));

        //    Trying laptop class
        Laptop myLaptop = new Laptop("MSI",12, "Intel Core i7-4700MQ", 500, 12);
        System.out.println("\n" + "***My Laptop***\n" + myLaptop);
        System.out.println("➤ Connect to TV via Screen Mirroring:");
        System.out.println(myLaptop.screenMirroring());

        //    Trying smartphone class
        SmartPhone myPhone = new SmartPhone("Samsung Galaxy", 8, "Snapdragon 855", 256,"T-Mobile");
        System.out.println("\n" + "***My Smart Phone***\n" + myPhone);
        System.out.println("➤ Make a call:");
        System.out.println(myPhone.makeCall("Milhouse Van Houten"));
        System.out.println("➤ Search with Smart Assistant:");
        System.out.println(myPhone.smartSearch("Java Tutorials"));
    }

}

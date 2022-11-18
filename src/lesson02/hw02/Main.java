package lesson02.hw02;

public class Main {

    public static void main(String[] args) {

        PC pc = new PC();
        pc.setProcessor("i7");
        pc.setMemory("32Gb");
        System.out.println("----------------------------");
        System.out.println("PC created: " + pc);

        Laptop laptop = new Laptop();
        laptop.setProcessor("i3");
        laptop.setMemory("8Gb");
        laptop.setBattery("100Ah");
        System.out.println("----------------------------");
        System.out.println("Laptop created: " + laptop);

        Ultrabook ultrabook = new Ultrabook();
        ultrabook.setProcessor("m1");
        ultrabook.setMemory("16Gb");
        ultrabook.setBattery("50Ah");
        ultrabook.setWeight(1);
        System.out.println("----------------------------");
        System.out.println("Ultrabook created: " + ultrabook);

        Workstation workstation = new Workstation();
        workstation.setProcessor("i9");
        workstation.setMemory("128Gb");
        workstation.setBattery("100Ah");
        workstation.setFormat("ATX");
        System.out.println("----------------------------");
        System.out.println("Workstation created: " + workstation);
    }
}

public class Computer {

    private final String vendor;
    private final String name;
    private double allWeight = 0;

    public Computer (String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    Processor processor = new Processor(Name.Intel, Core.Sixteen,
            5000, 0.1);
    RAM ram = new RAM(TypeRAM.DDR4, 6,0.05);
    HardDisk hardDisk = new HardDisk(TypeHardDisk.SSD, 1000, 0.5);
    Monitor monitor = new Monitor(Diagonal.thirty_seven, TypeMonitor.IPS, 1.5);
    Keyboard keyboard = new Keyboard(TypeKeyboard.wireless, LED.YES, 1);

    public void print () {
        System.out.println("Заказчик - " + vendor + ";" + " имя - " + name);
    }
    public void componentsPrint () {
        processor.print();
        ram.print();
        hardDisk.print();
        monitor.print();
        keyboard.print();
    }
    public void componentsWeight () {
        allWeight = processor.getWeight() + ram.getWeight() + monitor.getWeight() + hardDisk.getWeight() +
                keyboard.getWeight();
        System.out.println("Общий вес: " + allWeight);
    }
}
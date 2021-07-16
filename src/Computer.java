public class Computer {

    public void Computer (){
        Processor processor = new Processor(Name.AMD, Core.Sixteen,
                5000, 0.1);
        RAM ram = new RAM(TypeRAM.DDR4, 6,0.05);
        HardDisk hardDisk = new HardDisk(TypeHardDisk.SSD, 1000, 0.5);
        Monitor monitor = new Monitor(Diagonal.thirty_seven, TypeMonitor.IPS, 1.5);

    }
}

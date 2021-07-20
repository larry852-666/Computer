public class HardDisk {
    private TypeHardDisk typeHardDisk;
    private final int volume;
    private final double weight;

    public HardDisk (TypeHardDisk typeHardDisk, int volume, double weight) {

        this.typeHardDisk = typeHardDisk;
        this.volume = volume;
        this.weight = weight;
    }
    public void print() {
        System.out.println("Тип диска: " + typeHardDisk + ";" + " Объем памяти: " + volume);
    }
    public double getWeight () {
        return weight;
    }
}

public class RAM {
    private TypeRAM type;
    private final int volume;
    private final double weight;


    public RAM (TypeRAM type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public void print() {
        System.out.println("Тип RAM: " + type + ";" + " Объем RAM: " + volume);
    }
    public double getWeight () {
        return weight;
    }
}

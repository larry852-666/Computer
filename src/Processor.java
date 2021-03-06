public class Processor {

    private final Name name;
    private final Core core;
    private final int frequency;
    private final double weight;

    public Processor(Name name, Core core, int frequency, double weight) {
        this.name = name;
        this.core = core;
        this.frequency = frequency;
        this.weight = weight;
    }
    public void print() {
        System.out.println("Процессор: " + name + ";" + " Ядра: " + core + ";" + " Частота: " + frequency);
    }

    public double getWeight () {

        return weight;
    }

}

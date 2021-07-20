public class Monitor {
    private Diagonal diagonal;
    private TypeMonitor type;
    private final double weight;

    public Monitor (Diagonal diagonal, TypeMonitor type, double weight){
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }
    public void print () {
        System.out.println("Диагональ монитора: " + diagonal + ";" + " Тип монитора: " + type);
    }
    public double getWeight () {

        return weight;
    }
}

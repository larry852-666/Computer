public class Keyboard {
    private final TypeKeyboard type;
    private final LED led;
    private final double weight;

    public Keyboard (TypeKeyboard type, LED led, double weight) {
        this.type = type;
        this.led = led;
        this.weight = weight;
    }
    public void print () {
        System.out.println("Тип клавиатуры: " + type + ";" + " Подстветка: " + led);
    }
    public double getWeight () {
        return weight;
    }
}

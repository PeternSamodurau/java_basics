public class Keyboard {
    private final String keyboard_type;   // Тип клавиатуры
    private final String keyboard_light;  // Подсветка клавиатуры
    private final double keyboard_weight; // Вес клавиатуры гр.

    public Keyboard() {
        keyboard_type = "Mechanical keyboard";
        keyboard_light = "Keyboard backlight";
        keyboard_weight = 200;
    }
    public String getKeyboard_type() {
        return keyboard_type;
    }

    public String getKeyboard_light() {
        return keyboard_light;
    }

    public double getKeyboard_weight() {
        return keyboard_weight;
    }
    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboard_type='" + keyboard_type + '\'' +
                ", keyboard_light='" + keyboard_light + '\'' +
                ", keyboard_weight=" + keyboard_weight +
                '}';
    }
}

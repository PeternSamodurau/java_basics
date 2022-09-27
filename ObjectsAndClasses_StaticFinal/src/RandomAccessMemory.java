public class RandomAccessMemory {
    private final String ram_type;      // Тип оперативной памяти
    private final int ram_amount;       // Объем оперативной памяти Gb
    private final double ram_weight;    // Вес оперативной памяти гр

    public RandomAccessMemory() {
        ram_type = "DD4";
        ram_amount = 500;
        ram_weight = 7;
    }

    public String getRam_type() {
        return ram_type;
    }

    public int getRam_amount() {
        return ram_amount;
    }

    public double getRam_weight() {
        return ram_weight;
    }
    @Override
    public String toString() {
        return "RandomAccessMemory{" +
                "ram_type='" + ram_type + '\'' +
                ", ram_amount=" + ram_amount +
                ", ram_weight=" + ram_weight +
                '}';
    }

}

public final class Monitor {
    private final int diagonal_monitor;
    private final double weight_monitor;  // Вес монитора гр.
    private final String type_monitor;

    public Monitor() {
        diagonal_monitor = 17;
        weight_monitor = 2000;
        type_monitor = "LED";
    }

    public int getDiagonal_monitor() {
        return diagonal_monitor;
    }

    public double getWeight_monitor() {
        return weight_monitor;
    }

    public String getType_monitor() {
        return type_monitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal_monitor=" + diagonal_monitor +
                ", weight_monitor=" + weight_monitor +
                ", type_monitor='" + type_monitor + '\'' +
                '}';
    }

}







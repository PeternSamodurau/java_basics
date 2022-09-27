public class HardDiskDrive {
    private final String hdd_type;             // Тип жесткого диска
    private final int hdd_amount;                // Объем жесткого диска
    private final double hdd_weight;// Вес жесткого диска гр.

    public HardDiskDrive() {
        hdd_type = "HDD";
        hdd_amount = 300;
        hdd_weight = 700;
    }

    public String getHdd_type() {
        return hdd_type;
    }

    public int getHdd_amount() {
        return hdd_amount;
    }

    public double getHdd_weight() {
        return hdd_weight;
    }
    @Override
    public String toString() {
        return "HardDiskDrive{" +
                "hdd_type='" + hdd_type + '\'' +
                ", hdd_amount=" + hdd_amount +
                ", hdd_weight=" + hdd_weight +
                '}';
    }
}

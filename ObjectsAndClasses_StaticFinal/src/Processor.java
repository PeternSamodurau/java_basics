public final class Processor {
    private final double clock_rate_processor;
    private final int core_amount_processor;
    private final double weight_processor;              // Вес процессора в гр.
    private final String manufacturer_processor;

    public Processor() {
        clock_rate_processor = 2.4;
        core_amount_processor = 6;
        weight_processor = 10;
        manufacturer_processor = "intel";
    }

    public double getClock_rate_processor() {
        return clock_rate_processor;
    }

    public int getCore_amount_processor() {
        return core_amount_processor;
    }

    public double getWeight_processor() {
        return weight_processor;
    }

    public String getManufacturer_processor() {
        return manufacturer_processor;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "clock_rate_processor=" + clock_rate_processor +
                ", core_amount_processor=" + core_amount_processor +
                ", weight_processor=" + weight_processor +
                ", manufacturer_processor='" + manufacturer_processor + '\'' +
                '}';
    }


}


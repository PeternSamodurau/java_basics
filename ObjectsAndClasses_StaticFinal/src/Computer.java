public class Computer {
    private final String name;
    private final String vendor;
    private final Processor processor;
    private final Monitor monitor;
    private final RandomAccessMemory randomAccessMemory;
    private final HardDiskDrive hardDiskDrive;
    private final Keyboard keyboard;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", processor=" + processor +
                ", monitor=" + monitor +
                ", randomAccessMemory=" + randomAccessMemory +
                ", hardDiskDrive=" + hardDiskDrive +
                ", keyboard=" + keyboard +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public HardDiskDrive getHardDiskDrive() {
        return hardDiskDrive;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer(String name, String vendor, Processor processor, Monitor monitor,
                    RandomAccessMemory randomAccessMemory, HardDiskDrive hardDiskDrive, Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.processor = processor;
        this.monitor = monitor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.keyboard = keyboard;
    }

    public double getWeightComputer(){
        return processor.getWeight_processor() + monitor.getWeight_monitor() + randomAccessMemory.getRam_weight()+
                hardDiskDrive.getHdd_weight()+keyboard.getKeyboard_weight();
    }


}
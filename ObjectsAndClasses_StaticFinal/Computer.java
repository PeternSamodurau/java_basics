public class Computer {
    private final String name;
    private final String vendor;
    private final CentralProcessor centralProcessor;
    private final RandomAccessMemory randomAccessMemory;
    private final HardDiskDrive hardDiskDrive;
    private final Keyboard keyboard;

    public Computer(String name,String vendor,
                    CentralProcessor centralProcessor,
                    RandomAccessMemory randomAccessMemory,
                    HardDiskDrive hardDiskDrive,
                    Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.centralProcessor = centralProcessor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.keyboard = keyboard;
    }

    public String getName() {

        return name;
    }

    public Computer setName(String name) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);
    }

    public String getVendor() {

        return vendor;
    }

    public Computer setVendor(String vendor) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);
    }


    public CentralProcessor getCentralProcessor() {

        return centralProcessor;
    }

    public Computer setCentralProcessor(CentralProcessor centralProcessor) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);

    }

    public RandomAccessMemory getRandomAccessMemory() {

        return randomAccessMemory;
    }

    public Computer setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);
    }

    public HardDiskDrive getHardDiskDrive() {

        return hardDiskDrive;
    }

    public Computer setHardDiskDrive(HardDiskDrive hardDiskDrive) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(name,vendor,centralProcessor,randomAccessMemory,hardDiskDrive,keyboard);
    }


}

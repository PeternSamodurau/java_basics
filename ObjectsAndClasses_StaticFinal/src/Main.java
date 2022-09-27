public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        System.out.println(processor);

        Monitor monitor = new Monitor();
        System.out.println(monitor);

        RandomAccessMemory randomAccessMemory = new RandomAccessMemory();
        System.out.println(randomAccessMemory);

        HardDiskDrive hardDiskDrive = new HardDiskDrive();
        System.out.println(hardDiskDrive);

        Keyboard keyboard = new Keyboard();
        System.out.println(keyboard);

        Computer computer1 = new Computer("SAMSUNG","INTEL",processor,monitor,randomAccessMemory,hardDiskDrive,keyboard);
        System.out.println(computer1);

        //Computer computer2 = new Computer();    нужны сеттеры для всех комплектующих

        System.out.println("Сумарный вес всех комплектующих компьютера :" + " " + computer1.getWeightComputer() + "" + " гр. ");

    }
}

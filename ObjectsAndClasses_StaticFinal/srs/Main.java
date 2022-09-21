package srs;

import srs.*;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("NOTEBOOK",
                                         "SAMSUNG",
                                          CentralProcessor.PROCESSOR_AMOUNT_CORE,
                                          RandomAccessMemory.RAM_AMOUNT,
                                          HardDiskDrive.HDD_AMOUNT,
                                          Keyboard.KEYBOARD_TYPE);
        computer1.setName("Notebook1");
        computer1.setVendor("IBM");
        computer1.setCentralProcessor(CentralProcessor.PROCESSOR_AMOUNT_CORE);
        computer1.setRandomAccessMemory(RandomAccessMemory.RAM_AMOUNT);

        System.out.println(computer1.getCentralProcessor());
    }
}

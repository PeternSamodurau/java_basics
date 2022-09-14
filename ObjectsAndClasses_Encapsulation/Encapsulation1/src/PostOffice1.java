public class PostOffice1 {
    private final double sizePackage;
    private final double weightPackage;
    private final String deliveryAddress;
    private final boolean markingPackage;  // наличие почтовой маркировки - Верх товара
    private final String numberPackage;    // буквенно цифровой почтовый номер
    private boolean fragilePackage;  // наличие почтовой маркировки - Хрупкий товар

    public PostOffice1(double sizePackage,
                      double weightPackage,
                      String deliveryAddress,
                      boolean markingPackage,
                      String numberPackage,
                      boolean fragilePackage) {
        this.sizePackage = sizePackage;
        this.weightPackage = weightPackage;
        this.deliveryAddress = deliveryAddress;
        this.markingPackage = markingPackage;
        this.numberPackage = numberPackage;
        this.fragilePackage = fragilePackage;
    }


    public double getSizePackage() {
        return sizePackage;
    }


    public PostOffice1 setSizePackage(double sizePackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public double getWeightPackage() {
        return weightPackage;
    }

    public PostOffice1 setWeightPackage(double weightPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public PostOffice1 setDeliveryAddress(String deliveryAddress) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public boolean isMarkingPackage() {
        return markingPackage;
    }

    public PostOffice1 setMarkingPackage(boolean markingPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public String getNumberPackage() {
        return numberPackage;
    }

    public PostOffice1 setNumberPackage(String numberPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public boolean isFragilePackage() {
        return fragilePackage;
    }

    public PostOffice1 setFragilePackage(boolean fragilePackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage);
    }

    public String toString() {
        return " габариты посылки " + sizePackage + "\n"
                + " вес посылки " + weightPackage + "\n"
                + " адрес доставки " + deliveryAddress + "\n"
                + " Верх товара " + markingPackage + "\n"
                + " Почтовый номер " + numberPackage + "\n"
                + " Хрупкий товар " + fragilePackage;
    }
}

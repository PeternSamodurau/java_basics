public class PostOffice1 {
    private final double sizePackage;
    private final double weightPackage;
    private final String deliveryAddress;
    private final boolean markingPackage;  // наличие почтовой маркировки - Верх товара
    private final String numberPackage;    // буквенно цифровой почтовый номер
    private final boolean fragilePackage;// наличие почтовой маркировки - Хрупкий товар
    private final Dimensions1 dimensions;


    public PostOffice1(double sizePackage,
                       double weightPackage,
                       String deliveryAddress,
                       boolean markingPackage,
                       String numberPackage,
                       boolean fragilePackage,
                       Dimensions1 dimensions) {
        this.sizePackage = sizePackage;
        this.weightPackage = weightPackage;
        this.deliveryAddress = deliveryAddress;
        this.markingPackage = markingPackage;
        this.numberPackage = numberPackage;
        this.fragilePackage = fragilePackage;
        this.dimensions = dimensions;
    }

    public Dimensions1 getDimensions() {
        return dimensions;
    }

    public PostOffice1 setDimensions1(Dimensions1 dimensions) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public double getSizePackage() {
        return sizePackage;
    }


    public PostOffice1 setSizePackage(double sizePackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public double getWeightPackage() {
        return weightPackage;
    }

    public PostOffice1 setWeightPackage(double weightPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public PostOffice1 setDeliveryAddress(String deliveryAddress) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public boolean isMarkingPackage() {
        return markingPackage;
    }

    public PostOffice1 setMarkingPackage(boolean markingPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public String getNumberPackage() {
        return numberPackage;
    }

    public PostOffice1 setNumberPackage(String numberPackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public boolean isFragilePackage() {
        return fragilePackage;
    }

    public PostOffice1 setFragilePackage(boolean fragilePackage) {
        return new PostOffice1(sizePackage, weightPackage, deliveryAddress, markingPackage, numberPackage, fragilePackage, dimensions);
    }

    public String toString() {
        return " габариты посылки " + sizePackage + "\n"
                + " вес посылки " + weightPackage + "\n"
                + " адрес доставки " + deliveryAddress + "\n"
                + " Верх товара " + markingPackage + "\n"
                + " Почтовый номер " + numberPackage + "\n"
                + " Хрупкий товар " + fragilePackage + "\n"
                + "Объем посылки " + dimensions.volumePackege();
    }
}

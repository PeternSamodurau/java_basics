public class Dimensions1 {
    private final int heightPackage;
    private final int longPackage;
    private final int widthPackage;

    public Dimensions1(int heightPackage, int longPackage, int widthPackage) {
        this.heightPackage = heightPackage;
        this.longPackage = longPackage;
        this.widthPackage = widthPackage;
    }

    public int getHeightPackage() {
        return heightPackage;
    }

    public Dimensions1 setHeightPackage(int heightPackage) {
        return new Dimensions1(heightPackage, longPackage, widthPackage);
    }

    public int getLongPackage() {
        return longPackage;
    }

    public Dimensions1 setLongPackage(int longPackage) {
        return new Dimensions1(heightPackage, longPackage, widthPackage);
    }

    public int getWidthPackage() {
        return widthPackage;
    }

    public Dimensions1 setWidthPackage(int widthPackage) {
        return new Dimensions1(heightPackage, longPackage, widthPackage);
    }

    public int volumePackege() {
        int volume = heightPackage * longPackage * widthPackage;
        return volume;
    }

    public String toString() {
        return "Длина " + longPackage + "см" + "\n" + "Ширина " + widthPackage + "см"
                + "\n" + "Высота " + heightPackage + "см";
    }
}

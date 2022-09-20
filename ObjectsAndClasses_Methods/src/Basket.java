public class Basket {
    private String items = "";
    private double totalPrice = 0;
    private double totalWeight = 0;
    private static double totalPriceAllBaskets = 0;
    private static int totalCountAllBaskets = 0;

    public static int count = 0;

    public  Basket(){
        count = count +1;
    }

    public static double getTotalPriceAllBaskets() {

        return totalPriceAllBaskets;
    }

    public static int getTotalCountAllBaskets() {

        return totalCountAllBaskets;
    }

    public static double averagePriceBasket(){
        double averagePriceBasket = totalPriceAllBaskets/totalCountAllBaskets;
        return averagePriceBasket;
    }

    public static double averageCostBasket(){
        double averageCostBasket = totalPriceAllBaskets/count;
        return averageCostBasket;
    }

    public void add(String name, double price, int count, double weight) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт " + " - цена " + price + " - вес " + weight;
        totalPrice = totalPrice + price * count;
        totalWeight = totalWeight + weight;
        Basket.totalCountAllBaskets = Basket.totalCountAllBaskets + count;
        Basket.totalPriceAllBaskets = Basket.totalPriceAllBaskets + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public double getTotalPrice() {

        return totalPrice;
    }

    public double getTotalWeight() {

        return totalWeight;
    }

    public boolean contains(String name) {

        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

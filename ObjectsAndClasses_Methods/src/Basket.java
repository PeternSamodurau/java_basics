public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;

    public void add(String name, int price) {                // меняем количество в классе
        add(name, price, 5, 0);
    }

    public void add(String name, int price, int count) {      // меняем количество в Main
        add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт " + " - цена " + price + " - вес " + weight;
        totalPrice = totalPrice + price * count;
        totalWeight = totalWeight + weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {

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

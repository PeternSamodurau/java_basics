public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Колбаса", 76,1,55.4);
        basket.add("Молоко", 55,1,54.6);

        basket.print("Содержимое корзины :");

        basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());
        basket.clear();
        basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());



    }
}

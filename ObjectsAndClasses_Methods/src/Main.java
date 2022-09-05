public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Пиво",5);
        basket.add("Колбаса",20,15);
        basket.add("Молоко", 10, 5,56.9);

        basket.print("Содержимое корзины :");

        basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());
        basket.clear();
        basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());



    }
}

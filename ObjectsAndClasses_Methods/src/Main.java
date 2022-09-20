public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Молоко", 10.0, 5,56.9);
        Basket basket1 = new Basket();
        basket1.add("колбаса",20.0,10,32.4 );

        System.out.println("Общая стоимость всех корзин" + " " + Basket.getTotalPriceAllBaskets());
        System.out.println("Общее количество всх товаров" + " " + Basket.getTotalCountAllBaskets());

        System.out.println("Количество корзин" +" " + Basket.count + "шт");
        System.out.println("Средняя цена товара во всех корзинах" + " " + Basket.averagePriceBasket());
        System.out.println("Средняя стоимость корзины" + " " + Basket.averageCostBasket());



        // basket.add("Пиво",5);
        //basket.add("Колбаса",20,15);
        //basket.print("Содержимое корзины :");
        //basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());
        //basket.clear();
        //basket.print("Вес корзины:" + basket.getTotalWeight() + "\n" +"Стоимость корзины:" + basket.getTotalPrice());



    }
}

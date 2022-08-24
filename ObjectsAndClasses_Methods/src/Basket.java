public class Basket {
    public static String items = "";   // предметы
    public static int totalPrice = 0;   // общая стоимость товаров
    public static double totalWeight = 0; // общая масса всех товаров

    public static void main(String[] args) {
        add("Колбаса", 76,200.23);
        add("Молоко",55,1.1);
        add("Масло",120,500.23);
        print("Содержимое корзины:");
        System.out.println("Общая стоимость товаров:" +getTotalPrice());
        System.out.println("Общий вес товаров:" + getTotalWeight());
        clear();
        System.out.println();
        print("Содержимие корзины:");
        System.out.println("Общая стоимость товаров:" +getTotalPrice());
        System.out.println("Общий вес товаров:" + getTotalWeight());
    }
    public static void add(String name, int price,double weight){            // мтод присв предмету название и цену
        if (contains(name)){                                   // проверяем есть ли в корзине товар с именем name
            return;
        }
        items = items + "\n" + name +" - цена " + price +" - вес "+ weight;
        totalPrice = totalPrice + price;
        totalWeight = totalWeight + weight;
    }

    public static void clear(){                           // метод чистим от предметов
        items = "";
        totalPrice =0;
        totalWeight =0;
    }
    public static int getTotalPrice(){
        return totalPrice;                              // возвращает переменную общая цена
    }
    public static double getTotalWeight(){                     // возвращает переменную общая масса
        return totalWeight;
    }
    public static boolean contains(String name){          // проверяем есть ли товар
        return  (items.contains(name));
    }

    public static void print(String title){               //метод печатаетпеременную title-содержимое корзины
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

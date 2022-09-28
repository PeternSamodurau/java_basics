public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        char tab = 'А';
        int tabCod =tab;
        System.out.println("Числовой код А :" + " " + tabCod);

        char tab1 = 'я';
        int tabCod1 =tab1;
        System.out.println("Числовой код я :" + " " + tabCod1);

        for (int i=tab; i<=tab1; i=i+1){
            char c = (char) i;
            System.out.println(i + " " + " - числовой код буквы - " + c);
        }
        char tab3 = 'ё';
        int tabCod3 =tab3;
        System.out.println("Числовой код ё :" + " " + tabCod3);

        char tab4 = 'Ё';
        int tabCod4 =tab4;
        System.out.println("Числовой код Ё :" + " " + tabCod4);


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}

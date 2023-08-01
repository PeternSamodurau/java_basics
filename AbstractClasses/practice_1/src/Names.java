import java.util.Random;

public enum Names {
    Алексей_Ивлиев,
    ПЕТР_ПЕРТОВ,
    Анна_Сетяева,
    Дмитрий_Кочергин,
    Михаил_Быковский,
    Артём_Фигурнов,
    Марина_Евстафьева,
    Павел_Смородинов,
    Жанна_Ковалёва,
    Степан_Богданов,
    Виктор_Рязанов,
    Савелий_Фёдоров,
    Андрей_Леонов,
    Татьяна_Рыхальская,
    Анастасия_Бернадо,
    Евгений_Алфёров;

    private static final Random random = new Random();

    public static Names randomNames() {
        Names[] names = values();
        return names[random.nextInt(names.length)];
    }
}


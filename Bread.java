public class Bread extends Food{
    String flourType;                                              // Переменная о типе муки.
    public Bread(String name, int price, int numbers, String measureUnit, String expirationDate, String flourType) {
        super(name, price, numbers, measureUnit, expirationDate);  // Импорт характеристик родительского класса.
        this.flourType = flourType;                                // Добавление новой характеристики.
    }
    public String toString(){                                      // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nТип муки:            " + flourType;
    }
}

public class Lemonade extends Drinks{
    public Lemonade(String name, int price, int numbers, String measureUnit, Double volume) {
        super(name, price, numbers, measureUnit, volume);       // Импорт характеристик родительского класса.
    }
    public String toString(){                                   // Метод вывода сведений о продуктах данного класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nОбъем:               " + volume;
    }
}

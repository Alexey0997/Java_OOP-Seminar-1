public class Drinks extends Product{
    Double volume;                                           // Переменная об объеме тары.
    public Drinks(String name, int price, int numbers, String measureUnit, Double volume) {
        super(name, price, numbers, measureUnit);            // Импорт характеристик родительского класса.
        this.volume = volume;                                // Добавление новой переменной.
    }

    public String toString(){                                // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nОбъем:               " + volume;
    }
}
